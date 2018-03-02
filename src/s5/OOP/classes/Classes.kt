package s5.OOP.classes

fun main(args: Array<String>) {
    val cookie = Cookie("choco")
}

class Cookie (val name: String, var glutenFree : Boolean = true  ){ //primary constructor declaration

//if I want protected constructor:
// class Cookie protected constructor(val name: String){

    /* longer version
    val name : String

    init {  //initializer block ~ body for constructor
        this.name = name
    }*/

    /* a bit shorter
    val name : String = name
    */

    /*
    var glutenFree : Boolean = true

    secondary constructor
    constructor(name: String, glutenFree : Boolean) : this(name){ //no vals vars
        this.glutenFree = glutenFree
    }
    */
}

class Demo {
    val dummy : String
    
    constructor(){
        dummy = "hello"
    }
}