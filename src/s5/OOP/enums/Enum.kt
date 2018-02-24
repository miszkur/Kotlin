package s5.OOP.enums

fun main(args: Array<String>) {
    print(Department.ACCOUNTING.departmentInfo())
}
enum class Department(val fullName: String, val numEmployees : Int) {

    HR("Human resources", 5), IT("Information Technologyu", 10), ACCOUNTING("Accounting", 15);
    // semicolon when we add function
    fun departmentInfo() =  "The $fullName department has $numEmployees employees"
}