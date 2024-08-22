package BasicSyntax

class Rectangle(val height:Int, val width:Int){
    val area = height * width;
    val perimeter = (height + width) * 2
    fun printRect() {
        println("height : ${height}")
        println("width : ${width}")
        println("area : ${area}")
        println("perimeter : ${perimeter}")
    }
}

fun main() {
    var rectangle = Rectangle(10,20)
    rectangle.printRect()

}