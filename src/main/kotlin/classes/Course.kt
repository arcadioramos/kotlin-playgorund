package classes

data class Course(
    val id  : Int,
    val name : String,
    val author : String
)

fun main() {
    val course = Course(1,"Reactive programming in modern java using reactor", "Arcadio")

    val course1 = Course(1,"Reactive programming in modern java using reactor", "Arcadio")

    println("Checking object equality: ${course == course1}")

    val course3 = course1.copy(3)
    println(course3)
}
