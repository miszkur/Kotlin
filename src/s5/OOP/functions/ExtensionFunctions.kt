package s5.OOP.functions

fun main(args: Array<String>) {
    println(Utils().upperFirstAndLastLetter("i am all in lowercase"))
    println("i use extension function".upperFirstLast())
}

class Utils {
    fun upperFirstAndLastLetter(str : String) : String {
        val upperFirstAndLast = str.substring(0,1).toUpperCase() + str.substring(1, str.length-1) +
                str.substring(str.length-1, str.length).toUpperCase()
        return upperFirstAndLast
    }
}
// extension function
fun String.upperFirstLast () : String {
    /*val upperFirstAndLast = this.substring(0,1).toUpperCase() + this.substring(1, this.length-1) +
            this.substring(this.length-1, this.length).toUpperCase()*/
    val upperFirstAndLast = substring(0,1).toUpperCase() + substring(1, length-1) +
            substring(length-1, length).toUpperCase()
    return upperFirstAndLast
}