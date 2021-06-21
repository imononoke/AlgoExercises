import lc._1_TwoSum
import testKt.Person

fun main(args: Array<String>) {
    println("Hello World!")

    // lc1
    var arr: IntArray = intArrayOf(3, 5, 9)
    var lc1 = _1_TwoSum.twoSum(arr, 8)
    println(lc1?.toList())

    test4()
    test6()
    test7()
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