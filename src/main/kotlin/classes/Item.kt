package classes

import java.lang.IllegalArgumentException

class Item() {
    var name : String = ""
    var price : Double = 0.0
        get() = field
        set(value) {
            println("Inside setter")
            if(value>=0.0){
                field = value
            }else{
                throw IllegalArgumentException("Negative price is not allowed!")
            }
        }
    constructor(_name: String) : this() {
        name = _name
    }
}

fun main(){
    val item = Item("Iphone")
    println("Item name is ${item.name}")
    item.price = 5.0
    println(item.price)
}