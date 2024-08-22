package other

data class Customer(val name: String, val email: String){

    override fun equals(other: Any?): Boolean {
        if(this.name == (other as Customer).name && this.email == other.email)
            return true
        return false
    }
}

class Student(val name: String, val email: String){

}

fun main() {
    val customer1 = Customer("Shuraif", "jaban@gmail.com")
    val customer2 = Customer("Shuraif Muhammed", "jaban@gmail.com")
    //copy method available by default in data class
    val customer = customer1.copy()
    println(customer1 == customer)

    val student1 = Student("Shuraif", "jaban@gmail.com")
    val student2 = Student("Shuraif", "jaban@gmail.com")


    println(student1 == student2)
}
