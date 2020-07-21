//Kotlin Newbie To Pro - WHEN - Part 15

fun main() {
    val age = readLine()?.toInt()

    when (age) {
        in 1..5 -> println("You're a young kid")
        in 6..17 -> println("You're a teenager")
        18 -> println("Finally, you are 18")
         19, 20 -> println("You're a young adult")
        in 21..65 -> println("You're an adult")
         else -> println("You're really old")
    }
}