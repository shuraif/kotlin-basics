package other

fun main() {

   var result:String? = methodNullableReturn(100)

    print(result)
}

fun methodNullableReturn(input:Int):String? {
    if(input > 10)
        return "greater that ten"
    else
        return null
}