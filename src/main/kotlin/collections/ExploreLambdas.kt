package collections

/*
* Higher Order Function
* */
fun calculate(x: Int, y: Int, op: (x:Int, y: Int) -> Int): Int {
    return op(x,y)

}
fun main(){

    val addLambda = { x:Int -> x+x}
    val addResult = addLambda(3)
    println(addResult)

    val multiplyLambda = { x:Int, y:Int ->
        println("X value is: $x and Y value is: $y")
        x * y
    }
    val multiplyResult = multiplyLambda(2,3)
    println(multiplyResult)
    val result = calculate(2,3) { a, b -> a * b }
    println(result)
    val add = calculate(2,3) { a, b -> a + b }
    println(add)
}