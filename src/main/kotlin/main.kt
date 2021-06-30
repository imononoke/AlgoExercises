import lc._1_TwoSum
import lc._2_AddTwoNumbers
import test.ListNode
import test.Person

fun main(args: Array<String>) {
    println("Hello World!")

    // lc1
    var arr: IntArray = intArrayOf(3, 5, 9)
    var lc1 = _1_TwoSum.twoSum(arr, 8)
    println(lc1?.toList())

//    var list = List(3, (3))
    var res = _2_AddTwoNumbers()
//    res.addTwoNumbers()

    test4()
    test6()
    test7()
    test8()
//    var listNode = ListNode()

    val from: Array<Int> = arrayOf(1, 3, 4)
    val to: Array<Any> = Array<Any>(3) { _ -> "hello" }
    for (item in to) {
        println("to: $item")
    }
    copy(from, to)
    for (item in to) {
        println("-- $item")
    }

    testExtends()
}

abstract class Animal {
    fun eat() {
        println("i'm " + myName())
    }
    abstract fun myName() : String
}

class Fish : Animal() {
    override fun myName(): String {
        return "fish"
    }
}

class Cat : Animal() {
    override fun myName(): String {
        return "cat"
    }
}

fun testExtends() {
    var fishList : MutableList<Fish> = ArrayList()
    fishList.add(Fish())

    val catList : MutableList<Cat> = ArrayList()
    catList.add(Cat())

    val animals1: MutableList<out Animal> = fishList
    val animals2: MutableList<out Animal> = catList
//    animals2.add(Fish())
    val animal1 = animals1[0]
    val animal2 = animals2[0]
    animal1.eat()
    animal2.eat()
}

fun copy(from: Array<out Any>, to: Array<Any>) {
    assert(from.size == to.size)

    for (i in from.indices) {
        to[i] = from[i]
    }
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun test4() {
    val m = intArrayOf(2, 3, 6)
    m.set(0, 4)
    println(m.toList())

    var x = 10
    var y = 20
    var max = if (x > y) {
        println("$x > $y")
        x
    } else {
        println("$x < $y")
        y
    }
    println("max: $max")
}

fun test6() {
    var a = 5
    var b = 10
    if (a in 2..b) {
        println("a in the range")
    }
    for (i in 10 downTo 2 step 2) {
        println("$i")
    }
}

fun test7() {
    var myHello = Person("isa")
}

class Runoob<out A>(val a: A) {
    fun foo(): A {
        return a
    }
}

fun test8() {
    var strCo : Runoob<String> = Runoob("a")
    var anyCo: Runoob<Any> = Runoob<Any>("b")
    anyCo = strCo
    println("anyco: " + anyCo.foo())
}