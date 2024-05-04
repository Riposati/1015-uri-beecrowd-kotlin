package br.com.gustavo

import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

fun Double.format(digits: Int) = "%.${digits}f".format(Locale.ENGLISH, this)

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    val firstPoint: List<String> = reader.nextLine().split(" ")
    val secondPoint: List<String> = reader.nextLine().split(" ")

    val x1: Double = firstPoint[0].toDouble()
    val y1: Double = firstPoint[1].toDouble()

    val x2: Double = secondPoint[0].toDouble()
    val y2: Double = secondPoint[1].toDouble()

    val answer: Double = sqrt((x2 - x1).pow(2.0) + ((y2 - y1).pow(2.0)))

    println(answer.format(4));
}