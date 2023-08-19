package collections

fun main(){

   val names = listOf("Carlinos","Richie","Parti")
    println("Names: $names")

    val namesMutableList = mutableListOf("Carlinos","Richie","Parti")
    namesMutableList.add("Arcadio")
    println("Names: $namesMutableList")

    val set = setOf("Carlinos","Richie","Parti")
    println("Names: $set")

    val setMutable = mutableSetOf("Carlinos","Richie","Parti")
    setMutable.add("Arcadio")
    println("Names: $setMutable")

   val nameAgeMap = mapOf("Dilip" to 34, "Scooby" to 4)
    println("nameAgeMap: $nameAgeMap")
    val nameAgeMapMutable = mutableMapOf("Dilip" to 34, "Scooby" to 4)
    println("nameAgeMapMutable: $nameAgeMapMutable")
    nameAgeMapMutable["Arcadio"] = 100
    println("nameAgeMapMutable: $nameAgeMapMutable")

}