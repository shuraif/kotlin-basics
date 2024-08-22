fun main(args: Array<String>) {
    print("Enter your name:")
    var name = readln();
    println("Hello ${name}!")
    println("Program arguments: ${args.joinToString()}")
}