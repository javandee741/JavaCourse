package Lesson21

import java.awt.Point

fun main() {
    println("The winner is ${getWinner(500,1200, 2500, 680)}")

}

fun getWinner(
    gryffindorPoints: Int,
    slyserinPoint: Int,
    ravenclawPoint: Int,
    hufflepufPoint:Int
): String{
    if (gryffindorPoints > slyserinPoint && gryffindorPoints > ravenclawPoint && gryffindorPoints > hufflepufPoint){ return "Griffindor"}
    else if (slyserinPoint > gryffindorPoints && slyserinPoint > ravenclawPoint && slyserinPoint > hufflepufPoint){ return "Slyserin"}
    else if (ravenclawPoint > gryffindorPoints && ravenclawPoint > hufflepufPoint && ravenclawPoint > slyserinPoint){ return "Ravenclaw"}
    else { return "Hufflepuff"}
}