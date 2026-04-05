package Lesson22

fun getWinner(gryffindorPoints: Int,
              slyserinPoint: Int,
              ravenclawPoint: Int,
              hufflepufPoint:Int):String{
    val maxPoints = maxOf(gryffindorPoints, slyserinPoint, ravenclawPoint, hufflepufPoint)

    return when(maxPoints){
        gryffindorPoints -> "Gryffindor"
        slyserinPoint -> "Slyserin"
        ravenclawPoint -> "Ravenclaw"
        else -> "Hufflepuff"
    }
}

fun main() {
    println(getWinner(1320,300,270,390))
}