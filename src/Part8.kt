//Kotlin Newbie To Pro - LOGICAL AND COMPARISON OPERATORS - Part 8
fun main() {
    val x = 5
    val y = 5
//    true
//    false
//    true
//    false
//    false
//    false
//    true
//    false

    println(x == y)
    println(x < y)
    println(x <= y)
    println(x > y)
    println(x != y)

    val a = 6
    val b = 10

    println(x == y && a == b)
    println(x == y || a == b)
    println(!(x == y || a == b))
    println(!(x == y || a == b && a > y))
}