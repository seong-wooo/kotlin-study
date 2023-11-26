package com.example.kotlin_in_action.chapter7

import java.util.Arrays

fun main() {
    val numbers = ArrayList<Int>()
    numbers += 1
    numbers += 2
    numbers += 3

    println(numbers)
}

//operator fun <T> MutableCollection<T>.plusAssign(element: T) {
//    this.add(element)
//}