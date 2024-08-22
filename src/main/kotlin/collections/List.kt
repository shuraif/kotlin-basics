package collections

import Person


fun main() {
    var immutableList = listOf(Person("Mayavi", 28), Person("Luttappi", 25), Person("Kuttoosan", 78))
    println("----------------immutableList-------------------")
    for(person in immutableList) {
        println("Name : ${person.name} , Age : ${person.age}")
    }

    println("----------------mutableListOf-------------------")
    var mutableList = mutableListOf<Person>(Person("Mayavi",29))
    mutableList.add(Person("dankini",66))

    for(person in mutableList) {
        println("Name : ${person.name} , Age : ${person.age}")
    }


    var arrayList = ArrayList<Person>()
    var mayavi = Person("Mayavi", 28)
    arrayList.add(mayavi)
    arrayList.add(Person("Luttappi", 25))
    arrayList.add(Person("Kuttoosan ", 78))
    println("----------------ArrayList-------------------")
    for(person in arrayList) {
        println("Name : ${person.name} , Age : ${person.age}")
    }

    when {
        mayavi in arrayList -> println("Mayavi is in the list")
        else -> println("Mayavi is not in the list")
    }
    println("----------------ArrayList after filter and sort to uppercase-------------------")
    arrayList.filter{it.age > 26 }
        .sortedBy { it.age }
        .map {
          Person(   it.name.uppercase(), it.age,)
        }.forEach {
            println("Name : ${it.name}  , Age :${it.age}")
        }

    var filteredPerson = arrayList.filter { it.age>26 }
    println("----------------filteredPerson-------------------")
    for(person in filteredPerson) {
        println("Name : ${person.name} , Age : ${person.age}")
    }

}