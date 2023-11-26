package com.example.kotlin_in_action.chapter7

import java.time.LocalDate

data class Point(val x: Int, val y: Int) : Comparable<Point> {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }

    override fun compareTo(other: Point): Int {
        return compareValuesBy(this, other, Point::x, Point::y)
    }

    operator fun get(index: Int): Int {
        return when (index) {
            0 -> x
            1 -> y
            else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
        }

    }
    operator fun minus(other: Point): Point {
        return Point(x - other.x, y - other.y)
    }
}


fun main() {
    val p1 = Point(10, 60)
    val p2 = Point(20, 40)
    println(p1 + p2)
    println(p1 - p2)
    println(p1 < p2)
    println("${p1[0]}, ${p1[1]}")

}