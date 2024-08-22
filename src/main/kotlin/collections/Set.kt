package collections

import Person

fun main() {
    var immutableSet = setOf(Person("Mayavi", 28), Person("Luttappi", 25), Person("Kuttosan", 78))

    for(p in immutableSet) {
        println("Name : ${p.name} , Age : ${p.age}")
    }

    var mutableSet = mutableSetOf<Person>(Person("Mayavi", 29))
    mutableSet.add(Person("Dankini", 66))

    for(p in mutableSet) {
        println("Name : ${p.name} , Age : ${p.age}")
    }
}