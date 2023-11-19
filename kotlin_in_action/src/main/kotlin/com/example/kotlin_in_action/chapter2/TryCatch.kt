package com.example.kotlin_in_action.chapter2

import java.io.BufferedReader

fun main() {

    val a = try {
        val reader = BufferedReader("input.txt".reader())
    } catch (e: Exception) {
        return
    } finally {
        println("This is the finally block")
    }

    println(a)
}