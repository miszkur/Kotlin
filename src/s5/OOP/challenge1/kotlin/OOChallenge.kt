package s5.OOP.challenge1.kotlin

fun main(args: Array<String>) {
    val bic1 = Bicycle(23, 44)
    val bic2 = MountainBike("blue", 23, 44, 55)
    val bic3 = RoadBike(23, 44, 55, 33)
    bic1.printDescription()
    bic2.printDescription()
    bic3.printDescription()
    MountainBike.availableColors.forEach{println(it)}
}

open class Bicycle(var cadence: Int, var speed: Int, var gear: Int = 10) {
    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() = println("Bike is in gear: $gear and candence: $cadence travelig at a speed of $speed .")
}

class MountainBike(var seatHeight: Int, cadence: Int, speed: Int, gear: Int = 12) : Bicycle(cadence, speed, gear) {

    constructor( color: String, seatHeight: Int, cadence: Int, speed: Int, gear: Int = 12) : this(seatHeight, cadence, speed, gear){
        println("Color of your bike is $color")
    }

    companion object {
         val availableColors = listOf<String>("blue", "red", "pink", "black")
    }

    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has a seat height of: $seatHeight inches")

    }
}

class RoadBike(val tireWidth: Int, cadence: Int, speed: Int, gear: Int) : Bicycle(cadence, speed, gear) {
    override fun printDescription() {
        super.printDescription()
        println("The road bike has a tire width of: $tireWidth inches")
    }
}

