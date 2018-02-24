package s5.OOP.companionObjects

// accesing sth in class withou creating an instance of this class

fun main(args: Array<String>) {
    println(SomeClass.accessPrivateVar()) //optional to call Companion
    println(SomeClass.accessPrivateVar())

    val someClass1 = SomeClass.justAssign("this is the string as is")
    val someClass2 = SomeClass.upperOrLower("this isn't the string as is", false)

    println(someClass2.str)
}

// priate constructor!
class SomeClass private constructor(val str : String){

    /* functions in companion object do the same things:
    val str : String

    constructor(st : String) {
        str = st
    }

    constructor(st : String, lowerCaste : Boolean) {
        str = if (lowerCaste)
            st.toLowerCase()
        else
            st.toUpperCase()
    }*/

    companion object SomeCompanion{
        // everything within companion obj is static
        private var privar = 6

        fun accessPrivateVar() = "my privar equals ${privar}"

        fun justAssign(st : String) = SomeClass(st)
        fun upperOrLower(st : String, lowerCaste : Boolean): SomeClass {
            if (lowerCaste)
                return SomeClass(st.toLowerCase())
            else
                return SomeClass(st.toUpperCase())
        }
    }
}