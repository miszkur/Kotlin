package s6.whenExpression

enum class Season {
    SPRING, SUMMER, FALL, WINTER
}

fun main(args: Array<String>) {

    val timeOfYear = Season.WINTER
    val str = when (timeOfYear) {
        Season.WINTER -> "Let it snow"
        Season.FALL -> "I'm singing in the rain"
        Season.SPRING -> "Wiosna, cieplejszy wieje wiatr"
        Season.SUMMER -> "Lato lato lato wszedzie!"
    }

    val num: Any = 195
    val y = 10
    //~~ switch in java
    //we dont need brake after each line
    when (num) {
        100, 600 -> println("600 or 100") // in case num is 100 or 600
        in 190..200 -> println("in range 190 - 200") // num in range 190 - 200
        300 + y -> println("equals to y + 300") //expressions
        is Int -> println("num is an integer ${num + 10}") //smartcasting
        is String -> println("num is a string") //smartcasting
        else -> println("Doeasn't match anything")
    }

    val z = when (num) {
        is Int -> {
            println("num is integer")
            num
        }
        is String -> 66
        else -> 44
    }

    val num1 = 15
    val num2 = 20

    //else if more concise :
    when {
        num1 < num2 -> println("num1 i less than num2")
        num1 > num2 -> println("num1 i greater than num2")
        else -> println("they are equal")
    }

}