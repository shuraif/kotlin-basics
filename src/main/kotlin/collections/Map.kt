package collections

fun main() {
    var immutableMap = mapOf<Int, String>(1 to "One", 2 to "Two", 3 to "Three")
    println(immutableMap)

    var mutableMap = mutableMapOf<Int, String>()
    mutableMap.put(1, "One")
    mutableMap.put(2, "Two")
    mutableMap.put(3, "Three")
    mutableMap.put(3, "Two plus one")
    println(mutableMap)

    println(mutableMap.get(2))
    println(mutableMap[1])
    println(mutableMap.getOrDefault(4, "Four"))
    println(mutableMap.getOrDefault(3, "Three"))


    for((key,value) in mutableMap) {
        println("Key: $key, Value: $value")
    }

}