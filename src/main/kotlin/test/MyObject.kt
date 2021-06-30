package test

object MyObject {
    var age: Int = 0
        get() = 20

    fun method() {
        println("method")
    }
}

class MyTest {
    companion object {
        var a : Int = 10
        fun method() {
            println("myobj method")
        }
    }
}

fun main() {
    MyObject.method()
    MyTest.method()
    MyTest.a
}