package classes

open class User(val name: String){
        open var isLoggedIn : Boolean = false
        open fun login() = println("Inside user login")

        private fun secret(){
            println("Inside user login")
        }

        protected open fun logout(){
            println("Inside user Login")
        }

}

class Student(name: String) : User(name){
    override var isLoggedIn : Boolean = true
    companion object {
        val noOfEnrolledCourses : Int = 10
        fun country() = "México"
    }
    override fun login() {
        println("Inside student login")
        super.login()
    }
    public override fun logout(){
        super.logout()
        println("Inside student logout")
    }

}

class Instructor(name: String) : User(name)

fun main(){
    val student = Student("Alex")
    student.logout()
    val country = Student.country()
    println("Name is : ${student.name} and his country is: ${country} and Enrolled courses are: ${Student.noOfEnrolledCourses}")
    student.login()
    val instructor = Instructor("Mateo")
    println("Name is : ${instructor.name}")
    instructor.login()

    val user = User("Arcadio")


}