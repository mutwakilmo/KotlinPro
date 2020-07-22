class Rectangle (
        val a : Double,
val b : Double
){
    //class sample
    init {
        println("rectangle created with a = $a and b= $b")
    }
    fun area() = a * b

}