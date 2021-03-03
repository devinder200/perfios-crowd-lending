package myproject

class Face {

    String name
    Nose nose

    static constraints = {
        nose nullable: true, blank: true
    }
}
