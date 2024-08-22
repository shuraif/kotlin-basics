package other

fun main() {
    printGreeting()
    printGreeting("Hi")
    printGreeting("Hi", "Shuraif")
}

fun printGreeting(greet:String = "Hello", name:String = "World"){
    println("$greet $name")
}