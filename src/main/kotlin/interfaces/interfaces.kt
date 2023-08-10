package interfaces

import classes.Course

interface CourseRepository {
    val isCoursePersisted : Boolean
    fun getById(id : Int) : Course

    fun save(course: Course) : Int {
        println("course: ${course}")
        return course.id
    }
}

interface Repository {
    fun getAll() : Any
}

interface A {
    fun doSomething(){
        println("Do something A")
    }
}

interface B {
    fun doSomething(){
        println("Do something B")
    }
}

class AB : A,B{
    override fun doSomething() {
        super<A>.doSomething()
        super<B>.doSomething()
        println("doSomething in AB")
    }


}

class SqlCourseRepository : CourseRepository, Repository{
    override var isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return  Course(id,"Reactive programming in modern java using reactor", "Arcadio")
    }

    override fun getAll(): Any {
        return 1
    }

    override fun save(course: Course): Int {
        isCoursePersisted = true
        return super.save(course)
    }
}

class NoSqlCourseRepository : CourseRepository{
    override var isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return  Course(id,"Reactive programming in modern java using reactor", "Arcadio")
    }

    override fun save(course: Course): Int {
        isCoursePersisted = true
        println("course in nosqlrepository: ${course}")
        return course.id
    }
}

fun main() {
    val sqlCourseRepository = SqlCourseRepository()
    val course = sqlCourseRepository.getById(1)
    println("Course persisted value is: ${sqlCourseRepository.isCoursePersisted}")
    println("Course is: ${course}")
    val courseId = sqlCourseRepository.save(Course(5,"Reactive programming in modern java using reactor", "Arcadio"))
    println("Saved course id: $courseId")
    println("Course persisted value is: ${sqlCourseRepository.isCoursePersisted}")
    val noSqlCourseRepository = NoSqlCourseRepository()
    val course1 = noSqlCourseRepository.getById(1)
    println("Course is: ${course1}")
    val savedCourseId = noSqlCourseRepository.save(Course(7,"Reactive programming in modern java using reactor", "Arcadio"))
    println("Saved course id: $savedCourseId")

    val ab = AB()
    ab.doSomething()
}