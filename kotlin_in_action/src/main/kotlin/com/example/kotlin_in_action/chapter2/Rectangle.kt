package com.example.kotlin_in_action.chapter2

fun main() {
    val rectangle = Rectangle(41, 41)
    println(rectangle.isSquare)
}

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}