package Lesson38

class Main {
    fun main() {
        val englishGreeteng: (String) -> Unit = { name -> println("Hello from Kotlin $name!") }
        englishGreeteng("Evgeny")
    }
}