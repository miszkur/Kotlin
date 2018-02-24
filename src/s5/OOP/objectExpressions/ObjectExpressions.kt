package s5.OOP.objectExpressions

// anonymous classes in java

fun main(args: Array<String>) {
    // its not a singleton

    var thisIsMutable = 45

    wantsInterface(object : SomeInterface { // object expressions
        override fun mustImplement(num: Int): String {
            //we can access outside properties
            thisIsMutable++
            return "This is from mustimplement: ${num * 100}"
        }
    })

    println(thisIsMutable)
}

interface SomeInterface {
    fun mustImplement(num : Int) : String
}

fun wantsInterface(si : SomeInterface) {
    println("Printing form wantsInterface ${si.mustImplement(3)}")
}