package s7.collections.lists

fun main(args: Array<String>) {
    val colorList = listOf("black", "white", "green")
    val strings = listOf("aga", "ala", "ala", "ala", "ania", "wiki")  // java.util.ArrayList

    strings.last() // -> last element
    strings.asReversed() // reverse

    /*if (strings.size > 5){
        println(strings[5] )
    }*/
    // better
    println(strings.getOrNull(5))

    val ints = listOf(1,2,3,4,5)
    ints.max() // -> 5

    //joining 2 lists to pairs
    println(colorList.zip(strings)) // -> [(black, aga), (white, ala), (green, ania)]  wiki is dropped

    //just joining
    val mergedLists = listOf(colorList, strings)
    println(mergedLists) //-> [[black, white, green], [aga, ala, ania, wiki]]

    val combinedLists = colorList + strings
    println(combinedLists)  // -> [black, white, green, aga, ala, ania, wiki]

    // no duplicates joining
    colorList.union(strings)

    //no duplicates
    colorList.distinct()

    val mutableColors = colorList.toMutableList()
    mutableColors.add("some other color")

}