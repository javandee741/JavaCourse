package Lesson20

fun main() {
    var multiply:(Int, Int)->Unit={ a:Int, b:Int->println("a * b = ${a*b}")}
    multiply(3,4)
}