//Kotlin Newbie To Pro - IF CONDITIONS - Part 9

fun main() {
    val x = 7
    val y = 7
    val  z = if (x + y == 14) 3 else 4

    if (x < y){
        println("x is less than y")
    } else if (x > y){
        println("x is greater than y")
    } else{
        println("x must be equal to y")
    }
    println("this value of z is :$z")
}