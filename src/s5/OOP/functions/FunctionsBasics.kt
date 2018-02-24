package s5.OOP.functions

// default return type is Unit ~~ void in java

fun main(args: Array<String>) {
    // named arguments
    println(labelMultiply(operand2 = 2, operand1 = 3))  //arguments in different order
    val emp = Employee("Kama")
    println(emp.upperCase())

    val car = Car("red", 1997)
    val car2 = Car("blue", 1997)
    val car3 = car.copy()
    printColors("no named argument before vararg", car, car2, car3, str = "named argument after")
    val manyCars = arrayOf(car, car2, car3)
    // ERROR -> printColors("", manyCars, str = "")
    printColors("", *manyCars, str = "") // * spread operator -> unpacks array
    val moreCars  = arrayOf(car, car2)
    val car4 = car2.copy()
    val lotsOfCars = arrayOf(*manyCars, *moreCars, car4)
    for(c in lotsOfCars)
        println(c)
}

// function with expression body
fun labelMultiply(operand1 : Int, operand2: Int, label : String
= "The answer is") : String = "$label: ${operand1 * operand2}"



class Employee(val firstName: String) {
    fun upperCase() = firstName.toUpperCase()
}

data class Car(val color : String, val date : Int) {
}

// as many cars as we want
fun printColors(color : String, vararg cars : Car, str : String) {
    for (car in cars)
        println(car.color)
}