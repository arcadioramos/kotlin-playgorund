package basics

fun main(){
    val name : String = "Arcadio"
    println(name)

    //name = "Arcadio2"

    var age : Int = 34
    println(age)
    age = 35
    println(age)

    val salary : Long = 30000L
    println(salary)

    val course = "Kotlin Spring"
    println("course: $course and the course length is ${course.length}")

    val multiline = "ABC \n  DEF"
    println(multiline)
}