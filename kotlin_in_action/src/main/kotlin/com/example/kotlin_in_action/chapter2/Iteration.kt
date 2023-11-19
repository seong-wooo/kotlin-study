package com.example.kotlin_in_action.chapter2

import java.util.*

fun main() {
    for (i in 1..100) {
        print(fizzBuzz(i))
    }

    println()

    for (i in 100 downTo 1 step 2) {
        print(fizzBuzz(i))
    }

    println()

    mapIter()
}

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}

fun mapIter() {
    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.code)
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
}