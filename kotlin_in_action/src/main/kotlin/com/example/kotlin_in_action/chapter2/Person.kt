package com.example.kotlin_in_action.chapter2

fun main() {
    val c = Person("Bob", true)
    println(c.name)
}

class Person(val name: String, val isMarried: Boolean) {
}