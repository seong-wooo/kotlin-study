package com.example.kotlin_in_action.chapter5

fun main() {
    val sum = { x: Int, y: Int -> x + y }
    println(sum(1, 2))

    println(
            run {
                println("Hello")
                println("World")
                3
            }
    )

    fun printHello() = println("print Hello")
    val printMessage = ::printHello
    printMessage()

    val listOfList = listOf(listOf(1, 2, 3), listOf(4, 5, 6))
    println(listOfList.flatten())

    listOfList.asSequence()
            .map { it.sum() }
            .filter { it < 10 }
            .forEach { println(it) }
}