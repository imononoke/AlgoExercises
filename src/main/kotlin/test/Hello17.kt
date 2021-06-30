package test

interface IAction {
    fun method() {
        println("IAction")
    }
}

open class B {
    open fun method() {
        println("B")
    }
}

class C: IAction, B() {
    override fun method() {
        super<IAction>.method()
        println("C")
    }
}

fun main() {
    var c = C()
    c.method()
}