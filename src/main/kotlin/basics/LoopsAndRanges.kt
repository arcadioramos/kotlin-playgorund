package basics

fun main() {

    val range = 1  .. 10
    for( i in range){
        println("i: ${i}")
    }

    val reverseRange = 10 downTo 1
    for(i in reverseRange){
        println("Reverse range: ${i}")
    }

    for(i in reverseRange step 3){
        println("reverseRange with skip: ${i}")
    }

    exploreWhile()
}

fun exploreWhile() {
    var x: Int = 1
    while (x < 5){
        println("Value of x is: ${x}")
        x++
    }
}