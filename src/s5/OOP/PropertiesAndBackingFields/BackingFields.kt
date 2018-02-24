package s5.OOP.PropertiesAndBackingFields

fun main(args: Array<String>) {
    val jon = Employee("Jon")
    print(jon.fullTime)
    jon.fullTime = false
}

class Employee (val name : String, fullTime : Boolean = true) { //fullTime is not in a custom constructor

    // custom getter -> immediately after property declaration
    var fullTime = fullTime

    get() {
        println("Running the custom getter")
        // backing field has identifier 'field'
        return field
    }

    set(value) {
        println("Running the custom getter")
        field = value
    }

}