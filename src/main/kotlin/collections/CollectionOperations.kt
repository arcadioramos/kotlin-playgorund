package collections

import dataset.Course
import dataset.CourseCategory
import dataset.KAFKA
import dataset.courseList

fun main() {
   val courseList = courseList()
    val devPredicate = {c: Course ->
        c.category == CourseCategory.DEVELOPMENT
    }
    val desPredicate = {c: Course -> c.category == CourseCategory.DESIGN}

    val list = listOf(listOf(1,2,3), listOf(4,5,6))
    val mapResult = list.map{outerList ->
        outerList.map{
            it.toDouble()
        }

    }
    val flatMapResult = list.flatMap{outerList ->
        outerList.map{
            it.toDouble()
        }

    }
   // println(mapResult)
    //println("flatMapResult ${flatMapResult}")

    //exploreFilter(courseList, devPredicate)
    //exploreMap(courseList, desPredicate)
    //val kafkaCourses = exploreFlatMap(courseList, KAFKA)
    //println(kafkaCourses)
    exploreHashMap()
}

fun exploreHashMap() {
    val nameAgeMutableMap = mutableMapOf("Arcadio" to 28, "Becky" to 27)
    nameAgeMutableMap.forEach{(k,v) ->
        println("Key is $k and the value is $v")
    }
    val value = nameAgeMutableMap.getOrElse("Arcadio") {"Richie"}
    println("value is $value")

    val result = nameAgeMutableMap.containsKey("Arcadio")
    println("result is $result")

    val filteredMap = nameAgeMutableMap.filterKeys { it.length > 5 }
        .map { it.key.uppercase() }
    println("filteredMap is $filteredMap")

    val maxAge = nameAgeMutableMap.maxByOrNull { it.value }
    println(maxAge)
}

fun exploreFlatMap(courseList: MutableList<Course>, kafka: String): List<String> {
   val kafkaCourses = courseList.flatMap { course ->
        val courseName = course.name
        course.topicsCovered.filter {
            it == kafka
        }.map {
            courseName
        }
    }
    return kafkaCourses
}

fun exploreMap(courseList: MutableList<Course>, predicate: (Course) -> Boolean){
   val coursesName = courseList
       .filter(predicate)
       .map { "${it.name} - ${it.category}" }
       .forEach{
           println(it)
       }

}
fun exploreFilter(courseList: MutableList<Course>, predicate: (Course) -> Boolean){
   courseList
       .filter { predicate.invoke(it) }
       .forEach{
           println("Courses: $it")
       }
}