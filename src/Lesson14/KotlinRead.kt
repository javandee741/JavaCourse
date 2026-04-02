package Lesson14

import java.util.Scanner

fun main() {
    print("Enter your name: ")
    val name: String? = readLine()
    print("Enter your email: ")
    val email: String? = readLine()
    print("Enter your password: ")
    val password: String? = readLine()

    print("Your name is $name and email is $email and password is $password")
}