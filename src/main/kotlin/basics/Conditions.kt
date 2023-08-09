package basics

fun main() {
    //if-else
    //when

    val name = "Alex"
    if(name.length == 4)  println("Name is four characters ${name}") else println("name isn't four characters ${name}");


//1 -> GOLD 2 -> SILVER 3 -> BRONZE
    val position = 1
    val medal = when(position){
        1 -> {
            "GOLD"
        }
        2 -> {
            "SILVER"
        }
        3 -> {
            "BRONZE"
        }
        else -> "NO MEDAL"
    }

    println(medal)

}

