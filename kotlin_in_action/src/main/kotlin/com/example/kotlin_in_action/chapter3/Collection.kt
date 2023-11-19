package com.example.kotlin_in_action.chapter3

import strings.SEPARATOR
import strings.joinToString
import strings.lastChar

fun main() {
    val set = setOf(1, 2, 3)
    val hashSet = hashSetOf(1, 2, 3)

    println(set.javaClass)
    println(hashSet.javaClass)

    val list = listOf(1, 2, 3, 4)
    println(list.max())
    println(list.last())
    println(list.first())

    println(SEPARATOR)
    println(list.joinToString(separator = "; ", prefix = "(", postfix = ")"))
    println(list.joinToString(postfix = ")"))
    println("abcdefg".lastChar())
    println("abcdefg".lastChar)

    val map = mapOf(1 to "one", 2 to "two", 3 to "three")


}