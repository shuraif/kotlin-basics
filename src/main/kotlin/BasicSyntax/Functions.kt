fun  main(){
    var sum = addNums(5, 6)
    println("Sum of 5 and 6 is ${sum}")

    fun subtract(a: Int , b:Int) = a-b

    var sub = subtract(10,5)
    print("Sub of 10 and 5 is ${sub}")
}
fun addNums(a: Int, b: Int): Int {
    return a + b
}