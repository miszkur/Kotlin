package s7.collections.lists

fun main(args: Array<String>) {
    val strings = listOf("aga", "ala", "ania", "wiki")  // java.util.ArrayList

    val emptyList = emptyList<String>() // kolin.collections.EmptyList

    val notNullList = listOfNotNull("hello", null, "goodbye")
    println(notNullList)

    val arrayList = arrayListOf(1,2,3) //immutable list, java.util.ArrayList
    val mutableList = mutableListOf(1,2,3,4) // mutable list, java.util.ArrayList

    val array = arrayOf("black", "white", "green")
    val colorList = listOf(*array) // spread operator
    val colorList2 = array.toList()

    val ints = intArrayOf(1,2,3) // there is ints.toList() method

}