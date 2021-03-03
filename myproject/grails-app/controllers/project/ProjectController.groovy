package project

import javax.xml.bind.ValidationException

class ProjectController {

    def index() {
        def projects = Project.list()
        render projects.name
    }

    def add(){
        Date nextWeek = new Date() + 7
        Project project = new Project(name: "Coca Cola", deadline: nextWeek)
        Project savedProject
        try{
            savedProject = project.save(failOnError: true)
        }catch(ValidationException e){
            render e.message
        }
        render "${savedProject.name} : ${savedProject.deadline}"
    }

    def deleteAll(){
        def projects = Project.list()
        projects.each{
            it.delete()
        }
        render "All projects deleted Successfully"
    }

    def delete(){
        def id = params.key
        Project project = Project.get(id)
        project.delete()

        render "Project ${id} deleted successfully"
    }
}
