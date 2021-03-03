package project

class Project {

    String name
    Date deadline

    static belongsTo = [owner: Person]

    static hasMany = [tasks: Task]

    static constraints = {
        owner nullable: true, blank: true
        tasks nullable: true, blank: true
    }
}
