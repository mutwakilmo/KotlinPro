//Kotlin Newbie To Pro - FUNCTIONS AND PARAMETERS - Part 16
//Kotlin Newbie To Pro - FUNCTIONS WITH RETURN VALUE - Part 17
fun main() {
    printThreeLine()
    printPow(2,2)
    printPow(2,3)
    printPow(2,4)
    printPow(2,5)

    val pow = printPow(2,2)
    println("mmmm 2 to the power of 2 is $pow")
}

fun printPow(base : Int, exponent: Int): Int {
    var result = 1
    for (i in 1..exponent){
        result *= base
    }
    println("$base to the power of $exponent is $result")
    return result
}

fun printThreeLine() {
    println("First")
    println("Second")
    println("Third")
}