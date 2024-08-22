fun main() {

    println("1.for loop")
    println("2.while loop")
    println("3.do while loop")
    print("Select demo :")
    var option = readln()
    if(option == "1") {
        demoFor()
    } else if(option == "2") {
        demoWhile()
    } else if(option == "3") {
        doWhileDemo()
    } else {
        println("Invalid option")
    }
}

fun demoFor(){
    for(i in 1..10) {
        print(i)
    }
}

fun demoWhile() {
    val limit = 10
    var i = 1;
    while(i < limit) {
        print(i)
        i++
    }
}

fun doWhileDemo() {
    var i = 1
    var limit =10
    do {
        print(i)
        i++
    }while( i < limit)
}