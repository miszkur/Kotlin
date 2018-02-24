package s7.LambdaExpression

fun main(args: Array<String>) {
    val employees = listOf(Employee2("igi", "igi", 2000),
            Employee2("Agi", "Er", 2004),
            Employee2("Jan", "Rad", 2010),
            Employee2("Ann", "Kow", 2002))

    findByLastName(employees, "igo")

    "Some String".apply somestring@{
        "another string".apply {
            println(toUpperCase()) // another string
            println(this@somestring.toLowerCase())
        }
    }
}

fun findByLastName(employees: List<Employee2>, lastName: String) {
    employees.forEach { if (it.lastName == lastName) {
        println("Yes, $it")
        return  // return from lambda and a function (non-local return)
        // to make a local return we have to label lambda
    } }

    println("no, sorry")
}

/*fun countTo100(): String{
    val numbers = StringBuilder()
    for (i in 1..99) {
        numbers.append(i)
        numbers.append(", ")
    }
    numbers.append(100)
    return numbers.toString()
}*/

// with function
fun countTo100() =
        with(StringBuilder()) {  //string builder is a receiver object
            for (i in 1..99) {
                append(i)  //we dont have to use numbers
                append(", ")
            }
            append(100)
            toString()
        }

//apply function
fun countTo100apply() =
        StringBuilder().apply {
            for (i in 1..99) {
                append(i)  //we dont have to use numbers
                append(", ")
            }
            append(100)
        }.toString()



data class Employee2(val firstName: String,val lastName: String, val startYear: Int) {

}