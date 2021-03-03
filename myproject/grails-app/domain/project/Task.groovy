package project

class Task {

    String name

    static belongsTo = [assignee: Person, project: Project]

    static constraints = {
        assignee nullable: true, blank: true
        project nullable: true, blank: true
    }
}
