package s6.ifExpression

fun main(args: Array<String>) {

    var num: Int
    val someCondition = 33<44
    /*if (someCondition) {
        num = 50
    } else {
        num = 23
    }*/


    //if expression
    num = if (someCondition) 50 else 55

    val num2 = if (someCondition) {
        //do sth
        50 //return value
    } else {
        23
    }

    println("the result of if expression is ${if (someCondition) 4 else 10}")
}