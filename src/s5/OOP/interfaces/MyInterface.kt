package s5.OOP.interfaces

import s5.OOP.inheritance.Printer

//no primary constructor
//they are open by default
interface MyInterface{

    // properties in interfaces dont have backing field
    val number: Int // abstract definition
    val concreteNumber: Int  // concrete number in interface -> we have to create get()
        get() = number +  10

    fun myFun(param : String) : String
}

interface SubIntefrface : MyInterface {
    fun mySubFun(param : Int) : Int
}

class MyClass(modelName : String) : Printer(modelName), SubIntefrface {
    override val number: Int = 25

    override fun bestSellingPrice(): Double {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun mySubFun(param: Int): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun myFun(param: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}