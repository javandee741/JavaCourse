package Lesson13

fun main() {
    var nullableString: String? = null
    println(nullableString)
    println(nullableString!!.length) //Error NullPointerException
    println(nullableString?.length) //not error
}