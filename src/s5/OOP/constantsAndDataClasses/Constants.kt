package s5.OOP.constantsAndDataClasses

import s5.OOP.PropertiesAndBackingFields.Employee

val MY_CONST = 100

fun main(args: Array<String>) {
    println(MY_CONST)
    val car = Car("blue", 1997)
    val car2 = Car("blue", 1997)
    val car3 = car.copy()
    // copying some of properties
    val car4 = car.copy(year = 2005)
    println(car == car2) // true
    val emp = Employee("jon")
    val emp2 = Employee("jon")
    println(emp == emp2)// false
}

// data class -> in java it has only getters and setters

// primary constructor has to have at least 1 parameter
// all parameters are marked var or val
// data class cant be abstract sealed or inner
// its best to declare all properties in primary constructor
data class Car(val color : String, val year: Int){
    // equals checks properties equality
    // to string prints fields
}