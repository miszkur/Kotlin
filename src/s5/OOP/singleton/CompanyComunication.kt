package s5.OOP.singleton

import java.time.Year

fun main(args: Array<String>) {
    println(CompanyComunication.getTagline())
    println(CompanyComunication.getCopyrightLine())
}

object CompanyComunication {

    val currentYear = Year.now().value

    fun getTagline() = "Our company rocks"
    fun getCopyrightLine() = "Copyright ${currentYear} Our Company. All rights reserved."
}