package com.example.kotlin_in_action.chapter8

fun main() {
    twoAndThree { a, b -> a + b }
    twoAndThree { a, b -> a * b }

    val string = "abcdefghijklm"
    println(string.filter { it !in 'a'..'f' })
}

fun twoAndThree(operation: (Int, Int) -> Int) {
    val result = operation(2, 3)
    println("The result is $result")
}

fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    for (index in 0 until length) {
        val element = get(index)
        if (predicate(element)) {
            sb.append(element)
        }
    }
    return sb.toString()
}