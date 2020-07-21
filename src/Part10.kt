//Kotlin Newbie To Pro - NULL VALUES AND USER INPUT - Part 10
fun main() {
    println("Enter your name")
    val userInput = readLine()

    println("You entered $userInput")
    println(userInput?.toUpperCase())
    println(userInput?.reversed())


  
}