package Lesson19

fun main() {
    println("The sum 10 numbers is ${getNumbers(10)}")
    println("The sum 20 numbers is ${getNumbers(20)}")
    println("The sum of 17 and 25 is ${getSumTwoNumbers(17,25)}")
}

fun getNumbers(i: Int): Int{
    var sum = 0
    var count = 0
    while (count <= i) {
        sum += count
        count++
    }
    return sum
}

fun getSumTwoNumbers(i: Int, j: Int): Int {
    return i + j
}