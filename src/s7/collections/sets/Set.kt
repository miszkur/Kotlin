package s7.collections.sets

fun main(args: Array<String>) {
    val setInts = setOf(1,2,3,4,55)
    setInts.plus(20) // "adding" (immutable)
    setInts.minus(4) // "removing"
    setInts.average()
    setInts.drop(3) // drop first 3 elements in set
    val mutableInts = mutableSetOf(1,2,4,54,6,6)
    mutableInts.plus(10) // we dont add really

    val immutableMap = mapOf(1 to Car("red", "Toyota", 2000),
            2 to Car("blue","Porsche", 1999),
            3 to Car("silver","Fiat", 2999))

    val mutableMap = mutableMapOf(1 to Car("red", "Toyota", 2000),
            2 to Car("blue","Porsche", 1999),
            3 to Car("silver","Fiat", 2999),
            20 to Car("red","Fiat", 2999),
            17 to Car("yellow","Fiat", 2999))

    // extract 1 property
    println(immutableMap.map { it.value.year })
    //chaining
    mutableMap.filter { it.value.model == "Ford" }.
            map { it.value.color }
    mutableMap.all{it.value.year > 2015} // -> false
    mutableMap.any{ it.value.year > 2015} // -> true
    mutableMap.count{ it.value.year > 2015}
    mutableMap.toSortedMap() // -> sorts by key

    val cars = mutableMap.values
    cars.find { it.year > 2014 } // -> returns first found element
    cars.groupBy { it.color }
    cars.sortedBy { it.year }

    // filtering
    setInts.filter { it % 2 != 0 }
    immutableMap.filter { it.value.year == 2000 }
    mutableMap.filter { it.value.color == "red" }
    // filter returns a new map

    val ints = arrayOf(1,2,3,4,5)
    /*val add10List: MutableList<Int> = mutableListOf()
    for (i in ints) {
        add10List.add(i+10)
    }*/
    val add10List = ints.map { it + 10 }

}

data class Car(val model: String, val color: String, val year: Int){}