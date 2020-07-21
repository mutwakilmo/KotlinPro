//Kotlin Newbie To Pro - VARARG, DEFAULT AND NAMED PARAMETERS - Part 18

fun main() {
searchFor("How to become android developer")
    searchFor("kotlin for android","FireFox" )
    searchFor(search = "Java for android", searchEngine = "Bing")

    
//    val array = intArrayOf(20, 25)
//    val max = getMax(1, 2, *array, 4, 5)
//    println("The max number is $max")
}

fun searchFor(search: String, searchEngine:String="Google"){
    println("Searching for $search on $searchEngine")
}
fun getMax(vararg numbers: Int): Int {
    var max = numbers[0]
    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }
    return max
}