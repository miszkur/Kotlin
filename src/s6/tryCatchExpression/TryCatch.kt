package s6.tryCatchExpression

//we dont have to specify which excwption a function throws
fun main(args: Array<String>) {
    println(getNumber("22.5") ?: "number isn't int") //elvis opertaor
}

fun getNumber(str: String): Int? {
    return try {
            Integer.parseInt(str)
        } catch(e: NumberFormatException) {
            null
        }
    finally {
        //it will always execute
        println("i'm in a finally block")
        // no value be returned from finally block
    }
}

// nothing usecase
fun notImplementedYet(something: String): Nothing { // fun never return a value
    throw IllegalArgumentException("Implement me!")
}