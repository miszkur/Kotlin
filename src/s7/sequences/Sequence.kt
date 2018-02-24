package s7.sequences

//when we dont know how big a collection will be
//each element is evaluated individually and then passed on
// heas only 1 function -> iterator
// someCollection.asSequence() for huge collection

fun main(args: Array<String>) {

    val immutableMap = mapOf(1 to Car("red", "Toyota", 2000),
            2 to Car("blue","Porsche", 1999),
            3 to Car("silver","Fiat", 2999),
            20 to Car("red","Fiat", 2999),
            17 to Car("yellow","Fiat", 2999))

    println(immutableMap.asSequence().filter { it.value.model == "Ford" }
            .map { it.value.color })

    listOf("Joe", "Mary", "Jane").asSequence()
            .filter { println("filtering $it"); it[0]=='J' }
            .map { println("mapping $it"); it.toUpperCase()}
            .toList() //terminal operation - without it filter and map wont execute\

    listOf("Joe", "Mary", "Jane").asSequence()
            .filter { println("filtering $it"); it[0]=='J' }  // filtering first is more efficient
            .map { println("mapping $it"); it.toUpperCase()}
            .find { it.endsWith('E')} //we evaluate just Joe and return
}



data class Car(val model: String, val color: String, val year: Int){}