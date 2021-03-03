package project

class PersonController {

    def index() {
        redirect (action: "list")
    }

    def list(){
        def persons = Person.list()

        render "Id: ${persons.id} , Name : ${persons.name} "
    }

    def get(){
        //checking n+1 queries
        def id = params.key
        Person person = Person.get(id)
        for(project in person.projects){
            render project.tasks[0].name
        }

    }

    def add(){
        Date date = new Date()
        Person person = new Person(name: "Ram")
        Project project1 = new Project(name: "Pepsi", deadline: date)
        Project project2 = new Project(name: "coke", deadline: date)

        project1.addToTasks(new Task(name: "intro task 1 of project 1"))
        project2.addToTasks(new Task(name: "intro task 1 of project 2"))

//        project1.save(flush: true, failOnError:true)
//        project2.save(flush:true)

        person.addToProjects(project1)
        person.addToProjects(project2)

        person.addToTasks(new Task(name: "intro task 1 of person 1", project: project1))
        person.addToTasks(new Task(name: "intro task 2 of person 1", project: project2))


        Person savedOne = person.save(flush:true)
        render "Saved: ${savedOne.id}"
    }

    def update(){
        def id = params.key
        Person person = Person.get(id)
        person.name = "edit 2" + person.name
        person.projects.find {it.name == "coke"}.name = "edit project 2"
        person.save()

        render "Updated: ${person.id}"
    }

    def delete(){
        def id = params.key
        Person person = Person.get(id)
        person.delete()

        render "Person ${person.id} deleted successfully"
    }

    def deleteAll(){
        def persons = Person.list()
        persons.each{
            it.delete()
        }

        render "All persons deleted successfully"
    }
}
