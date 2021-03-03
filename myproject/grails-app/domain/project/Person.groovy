package project

class Person {

    String name

    static hasMany = [projects : Project, tasks : Task]

    static constraints = {
        projects nullable: true, blank: true
        tasks nullable: true, blank: true
    }
}
