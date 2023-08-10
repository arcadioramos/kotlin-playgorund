package classes

class Person(
    val name : String = "",
    val age : Int = 0
) {
    var email : String = ""
    constructor(_email : String, _name: String = "", _age: Int = 0) : this(_name,_age) {
        email = _email
    }

     fun action(){
        println("Person walks")
    }

}

fun main(){
    val person = Person("Arcadio", 24)

    person.action()
    println("Name ${person.name} and the age is ${person.age}")

    val person2 = Person(_email = "Arcadio@gmail.com", _name = "Arcadio", _age = 25)
    println(person2.toString())
}