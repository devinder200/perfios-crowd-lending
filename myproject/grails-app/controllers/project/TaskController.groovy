package project


import org.springframework.dao.DataIntegrityViolationException

class TaskController {

    def index() {
        def endUserList = Task.list()
        render endUserList
    }

    def add(){
        Task task = new Task(name: "Ramu")
        task.save()
        task = Task.get(1)
        try{
            task.save(flush:true)
        }catch(DataIntegrityViolationException e){
            render e.message
        }
        render task.name
    }
}
