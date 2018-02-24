package s7.generics

import java.math.BigDecimal

fun main(args: Array<String>) {
    val list = mutableListOf("hello")
    list[0].toUpperCase()
    list.add("another item")
    list.printCollection2()
    val bdList = mutableListOf(BigDecimal(33), BigDecimal(10), BigDecimal(33), BigDecimal(2))

}

fun <T> printCollection(collectiuon: List<T>) {
    for (item in collectiuon)
        println(item)
}

//extension function
fun <T> List<T>.printCollection2() {
    for (item in this)
        println(item)
}