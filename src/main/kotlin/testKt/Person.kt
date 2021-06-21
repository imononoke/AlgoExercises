package testKt

open class Person constructor(name: String) {
    open lateinit var userName: String
    private var age: Int = 0
    private var addr: String

    init {
        println("init $name")
        this.userName = name
        this.addr = "sh"
    }

    constructor(name: String, age: Int): this(name) {
        println(userName + ", " + age)
        this.userName = userName
        this.age = age
    }

    open fun doPrint() {
        println("username: $userName, age: $age")
    }
}

class Stu(name: String, age: Int) : Person(name, age) {
    override lateinit var userName : String
    override fun doPrint() {

    }
}

class Stu2(name: String) : Person(name) {

}

fun main() {
    var p1 = Person("i")
    var p2 = Person("h2", 22)
}