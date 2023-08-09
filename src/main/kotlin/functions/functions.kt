package functions

import java.time.LocalDate


fun main() {
    //printName("Arcadio")
    //val result = addition(1,2)
    //println(result)
    //printPersonDetails("Arcadio", "Arcadioramosisw@gmail.com", LocalDate.parse("1999-07-28"))
    //printPersonDetails("Jahseh")
    val result = topLevelFunction()
    println(result)
    println(courseName)
}

fun addition(num1: Int, num2: Int): Int {
        return num1+num2
}

fun printName(name: String) {
    println("My name is: $name")
}

fun printPersonDetails(
    name: String,
    email: String = "",
    dob: LocalDate = LocalDate.now()
){
    println("Name is $name and the email is $email and the dob is $dob")
}