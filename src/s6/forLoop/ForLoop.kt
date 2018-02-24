package s6.forLoop

fun main(args: Array<String>) {

    val range = 1..5

    for (i in range)  // or for (i in 1..5)
        println(i)

    for (num in 1..20 step 6)
        println(num)

    for(i in 20 downTo 15 step 2)
        println(i)

    for(i in 1 until 10) // exclude 10
        println(i)

    val backRange = 5.downTo(1)
    val stepRange = 3..15
    val stepThree = stepRange.step(3)
    val reversedRange = range.reversed()

    val charRange = 'a'..'x'
    val stringRange = "ABD".."XYZ"

    println(3 in range) //->true
    println('q' in charRange) //->true
    println("CCCCCCC" in stringRange) //->true
    println("ZZZ" in stringRange) //->false

    val str = "Hello loop"
    for (s in str)
        print(s)

    val seasons = arrayOf("spring", "summer", "fall", "winter")
    for (season in seasons){
        //do sth
    }

    for (index in seasons.indices) {
        println("index: $index is an element: ${seasons[index]}")
    }

    //lambda
    seasons.forEach { println(it) }
    seasons.forEachIndexed { index, value ->  println("$value is season number $index")}

    val notASeason = "whatever" !in seasons  // -> true
    val notInRange = 32 !in 1..10 // -> true
    val notInStr = 'a' !in "hello" // -> true

    //naming loops -> better not to use it
    for (i in 1..3){
        println("i = $i")
        jloop@ for (j in 1..4) {
            println(" j= $j")
            for (k in 5..10) {
                println("k = $k")
                if (k == 7)
                    break@jloop
            }
        }
    }

}