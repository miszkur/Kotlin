package s6.challenge

fun main(args: Array<String>) {
    /*for ( i in 5..5000 step 5)
        println(i)*/

    /*for (i in -500..0)
        println(i)*/
/* FIBONACcI
    var first = 0
    var second = 1
    var tmp = 0
    println(first)
    println(second)
    for (i in 0..12){
        tmp = second
        second += first
        first = tmp
        println(second)
    }*/

    for (i in 1..5){
        println("i = $i")
        if (i==2)
            break
        jloop@for (j in 11..20) {
            println(" j= $j")
            for (k in 100 downTo 90) {
                println("k = $k")
                if (k==98)
                    break@jloop
            }
        }
    }

    // 1, 11, 100, 99, 98, 2

    var num : Int = 10
    var denum : Double = when {
        num < 100 -> 33.33
        num > 100 -> -55.66
        else -> 0.0
    }

    println(denum)
}