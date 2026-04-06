package Lesson29


class PersonKotlin constructor(name:String, age:Int){

    constructor() :this ("",0)

    constructor(name:String):this(name,0)



    companion object{
        const val KIND = "Human"

        fun getInstance(): PersonKotlin = PersonKotlin()

        fun getInstance(name:String): PersonKotlin = PersonKotlin(name)

        fun getInstance(name:String, age:Int): PersonKotlin = PersonKotlin(name, age)
    }


}