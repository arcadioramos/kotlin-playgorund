package collections

import dataset.Course
import dataset.CourseCategory
import dataset.courseList

fun main() {

    val namesListUsingSequence = listOf("Arcadio", "Becky", "Carlinos12")
        .asSequence()
        .filter { it.length >= 6  }
        .map{ it.uppercase()}
        .toList()

    println("namesListUsingSequence: $namesListUsingSequence")
    val devPredicate = {c: Course ->
        c.category == CourseCategory.DEVELOPMENT
    }
    exploreFilterUsingSequence(courseList(), devPredicate)
}

fun exploreFilterUsingSequence(courseList: MutableList<Course>, predicate: (Course) -> Boolean){
    courseList
        .asSequence()
        .filter { predicate.invoke(it) }
        .forEach{
            println("Courses: $it")
        }
}