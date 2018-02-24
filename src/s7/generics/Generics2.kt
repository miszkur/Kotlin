package s7.generics

fun main(args: Array<String>) {

    val ints = listOf(1, 2, 3, 4, 5)
    val shorts: List<Short?> = listOf(12, 3,4, 5, 6,6)
    val str = listOf("1", "2", "3")

    convertToInt(shorts)
    append(StringBuilder("str1 "), StringBuilder("str2"))

    var listAny: Any = listOf("str1, str2")
    if (listAny is List<*>){ //star projection syntax
        println("yes this is list! thank you star projection")
    }

    if (str is List<String>) {
        println("this list contains strings")
    }

    listAny = listOf(1,2,43) //error
    if (listAny is List<*>){
        val strList = listAny as List<String> // we didnt check if it is list of strinngs
        println(strList[1].replace("str", "string"))
    }
}

fun <T: Number?> convertToInt(collection: List<T>) {
    for (num in collection) {
        println("${num?.toInt()}")
    }
}

fun <T: Any> printCollection(collection: List<T>) { //accepts only non nullable types
    for (item in collection) {
        println(item)
    }
}

fun <T> append(item: T, item2: T)
where T: CharSequence, T: Appendable {
    println("result is ${item.append(item2)}")
}