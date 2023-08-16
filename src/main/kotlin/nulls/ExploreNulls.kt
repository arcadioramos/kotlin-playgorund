package nulls

data class Movie(
    val id: Int?,
    val name: String,
)

fun printName(name:String){
    println("Name is: ${name}")
}

fun main(){
    var nameNullable : String? = null

   // println(nameNullable!!)
    nameNullable?.run {
        printName(this)
    }
    println("Value is ${nameNullable?.length}") //safe operator
    //nameNullable = "Alex"
    //val length = nameNullable?.length?.toLong() ?: 0 // ?: Elvis operator

    val length = nameNullable?.length?.toLong()
    println("length: ${length}")
    nameNullable = "Arcadio"
    println(nameNullable)

    var name : String = "Arcadio"

   val movie = Movie(null, "Avengers")
   val savedMovie = saveMovie(movie)
    savedMovie.id!!
    println(savedMovie.id)
    println("Saved movie: $savedMovie")
}

fun saveMovie(movie: Movie): Movie{
    return movie.copy(id=1)
    //return movie
}