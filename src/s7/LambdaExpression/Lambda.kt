package s7.LambdaExpression

fun main(args: Array<String>) {
    run { println("i'm in the lambda")}

    val employees = listOf(Employee("igi", "igi", 2000),
            Employee("Agi", "Er", 2004),
            Employee("Jan", "Rad", 2010),
            Employee("Ann", "Kow", 2002))
    println(employees.minBy { it.startYear }) // e: Employee -> e.startYear
    // member reference
    println(employees.minBy(Employee::startYear))

    var num = 10
    run {
        num += 15  //we caN access local variable
        println(num)
    }

    //member refernce
    run { ::topLevel }
}

fun topLevel() = println("I'm a function")

fun useParameter(employees: List<Employee>, num: Int) {
    employees.forEach{
        println(it.firstName)
        println(num)
    }
}

data class Employee(val firstName: String,val lastName: String, val startYear: Int) {

}