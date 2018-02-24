package s7.collections.maps

fun main(args: Array<String>) {
    val immutableMap = mapOf(1 to Car("red", "Toyota", 2000),
            2 to Car("blue","Porsche", 1999),
            3 to Car("silver","Fiat", 2999))
    // java.util.LinkedHashMap

    val mutableMap = mutableMapOf("Aga's car" to Car("red", "Toyota", 2000),
            "Jan's car" to Car("blue","Porsche", 1999),
            "Igg's car" to Car("silver","Fiat", 2999))
    // java.util.LinkedHashMap

    // if we want hashmap -> hashMapOf(...)

    // destructuring declaration
    val pair = Pair(10, "ten")
    val (firstVal, secondVal) = pair


    // iterating
    for (entry in mutableMap) {
        entry.key
        entry.value
    }

    for ((key, value) in mutableMap) {
        key
        value
    }

    //if component functions are implemented
    // in data classes we have structuring declaration
    val car = Car("Toyota", "pink", 1998)
    val (model, color, year) = car

}

class Car(val model: String, val color: String, val year: Int){

    // component functions
    operator fun component1() = model
    operator fun component2() = color
    operator fun component3() = year

}