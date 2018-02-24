package s5.OOP.inheritance

//everything in kotlin is final by default
fun main(args: Array<String>) {
    val laser = LaserPrinter("hp", 77)
    laser.printModel()
    val child = Child("nanan")
}

abstract class Printer(val modelName : String){ //open -> its not final class
    open fun printModel() = println("The model name is: $modelName")
    abstract fun bestSellingPrice() : Double
}

open class LaserPrinter(modelName: String, ppm : Int) : Printer(modelName) {
    //override also means open if i dont want to allow overriding -> final
    final override fun bestSellingPrice(): Double = 128.88
    override fun printModel() = println("The model name of laser printer is: $modelName")

}

// you cant call a suoper secondary constructor if we have a primary constructor
open class Something{

    val param : String
    constructor(str : String){
        param =str
        println("i'm in the parents constructor")
    }
}

class Child : Something {

    constructor(str : String) : super(str){
        println("i'm in the child constructor")
    }
}


//cant be inheritet from (open is forbidden)
data class DataClass(val number : Int) {

}