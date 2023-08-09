package classes

class Person(
    val name : String = "",
    val age : Int = 0
) {

     fun action(){
        println("Person walks")
    }

}

fun main(){
    val person = Person("Arcadio", 24)

    person.action()
    println("Name ${person.name} and the age is ${person.age}")
}