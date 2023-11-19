package com.example.kotlin_in_action.chapter2

fun main(args: Array<String>) {
    println("Hello, World!")
    println(max1(1, 2))
    println(max2(1, 2))
    println(max3(2, 1))

    val name = if (args.isNotEmpty()) args[0] else "Kotlin"
    println("Hello, $name!")

}

fun max1(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun max2(a: Int, b: Int): Int = if (a > b) a else b

fun max3(a: Int, b: Int) = if (a > b) a else b
