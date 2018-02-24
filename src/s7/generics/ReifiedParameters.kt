package s7.generics

import java.math.BigDecimal

fun main(args: Array<String>) {

    val mixedList: List<Any> = listOf("aa", 3, BigDecimal(2), BigDecimal(44), 5.55)
    val bigDecimalsOnly = getElementsOfType<BigDecimal>(mixedList)

}

/*
fun <T> getElementsOfType(list: List<Any>): List<T> {
    var newList: MutableList<T> = mutableListOf()
    for (element in list) {
        if (element is T) {  ERROR!!!
            newList.add(element)
        }
    }
    return
}*/

inline fun <reified T> getElementsOfType(list: List<Any>): List<T> {
    var newList: MutableList<T> = mutableListOf()
    for (element in list) {
        if (element is T) {  // T isn't erased in runtime so we can check it
            newList.add(element)
        }
    }
    return newList
}
