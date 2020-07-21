//Kotlin Newbie To Pro - WHILE LOOP - Part 12

fun main() {
    var x = 3

    while (x > 2){
        println("Hello")
        x--
    }
    println("done")


    val myArray = arrayOf("Hello", "Guys", "What")
    val arrayLength = myArray.size
    var i = 0

    while (i < arrayLength){
        println(myArray[i])
        i++
    }
}