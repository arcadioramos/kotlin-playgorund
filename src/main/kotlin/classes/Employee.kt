package classes

data class Employee(
    val id : Int,
    val name : String
)

fun main() {
    val employee1 = Employee(1,"Malcolm")
    println(employee1)
    val employee2 = employee1.copy()
    println("Is employee1 equal to employee2? ${employee1 == employee2}")
    val employee3 = employee1.copy(3,"Employee3")
    println(employee3)
}
