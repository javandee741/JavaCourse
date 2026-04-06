package Lesson25and26

class PersonKotlin {
    var name :String = ""
    var age :Int = 0

    //empty constructor
    constructor():this("",0){}

    constructor(name:String, age:Int) {
        this.name = name
        this.age = age
    }

    fun sayHello() {
        println("Hello, my name is ${name} and I am $age.")
    }
}