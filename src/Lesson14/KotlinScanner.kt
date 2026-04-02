package Lesson14

import java.util.Scanner

fun main() {
    val Scanner = Scanner(System.`in`)
    print("Enter your name: ")
    val name: String? = Scanner(System.`in`).nextLine()
    print("Enter your email: ")
    val email: String? = Scanner(System.`in`).nextLine()
    print("Enter your password: ")
    val password: String? = Scanner(System.`in`).nextLine()

    print("Your name is $name and email is $email and password is $password")
}