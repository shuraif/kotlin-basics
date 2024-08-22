fun main() {
    print("Enter a number : ")
    var num:Int? = readLine()?.toIntOrNull()

    if(num != null && num % 2 == 0){
       print("${num} is even")
    } else {
        print("${num} is odd")
    }

    // using if as expression
    fun maxOf(a:Int, b:Int):Int = if(a>b) a else b
    println(maxOf(100,200))

}