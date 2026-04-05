package Lesson24

fun main() {
    val arrNumber: Array<Int> = arrayOf(1,2,3,4,5)
    var sumArray: Int = 0

    for (i in arrNumber.indices) {
        sumArray += arrNumber[i]
    }
    println("Sum of our array is ${sumArray}")
}