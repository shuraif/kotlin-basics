import Person;

fun main() {
    var person = Person("Shuraif", 28)
    printPerson(person)
    person.name = "Muhammed Shuraif"
    printPerson(person)


}

fun printPerson(person: Person) {
    println("Name : ${person.name} , Age : ${person.age}")
}