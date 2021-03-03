package myproject

class Nose {

    String name
    static belongsTo = [face:Face]

    static constraints = {
        face nullable: true, blank: true
    }
}
