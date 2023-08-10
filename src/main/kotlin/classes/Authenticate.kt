package classes

object Authenticate {

    fun authenticate(userName : String, password: String){
        println("User authenticated: ${userName}")
    }

}

fun main(){
    Authenticate.authenticate("arcadio", "abc")
}