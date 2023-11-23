package com.example.kotlin_in_action.chapter6

fun main() {
    val letters = Array(26) { i -> ('a' + i).toString() }
    println(letters.joinToString(", "))

    val ints = intArrayOf(1, 2, 3)
    ints.forEachIndexed {
        index, element -> println("Argument $index is: $element")
    }
    println(ints.joinToString(", "))
}