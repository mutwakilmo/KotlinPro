//Kotlin Newbie To Pro - LISTS - Part 14

fun main() {
/*    val array = arrayOf(1,2,3)
    val list = mutableListOf(1,2,3)
//    array[0] = 3
//    list[0] = 3
    list.add(4)
    list.removeAt(2)
    println(list)*/

    val list = mutableListOf<Int>()
    for (i in 1..10){
        val  x = readLine()?.toInt()

        if (x != null){
            list.add(x)
        }
       
       println(list)
    }
}