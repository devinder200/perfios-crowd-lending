package myproject

import project.Person

class FaceController {

    def index() {
        def id = params.key
        Face face = Face.get(id)
        Nose nose = face?.nose
        Nose nose2 = face?.nose
        println("name 1---"+face?.nose?.name)
        Face face2 = face
        println("name 2---"+face2?.nose?.name)
        String name = test(face)
        render name
    }

    def test(face2){
        println("****************************************enter inside test*****************************************")
        Nose nose = face2?.nose
        println("nose -"+face2?.nose?.name)
        return nose?.name
    }



    def add(){
        Face face = new Face(name: "Face 1")
        face.nose = new Nose(name: "nose 1")
        face.save(failOnError: true)
        render face.id
    }
}
