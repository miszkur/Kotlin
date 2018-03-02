package s5.OOP.accessModifiers

fun main(args: Array<String>) {
    // by default: public not package private!!!
    /* compilation to jvm:
     private -> package private
     internal -> public
     */
    //if top level is private-> everything in file can access it
    val em = Employee()
    //internal -> everything in a module can access it
}

private class Employee {

}