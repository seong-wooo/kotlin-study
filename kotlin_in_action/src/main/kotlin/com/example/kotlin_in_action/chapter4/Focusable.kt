package com.example.kotlin_in_action.chapter4

interface Focusable {
    fun showOff() = println("I'm focusable!")

    fun setFocus(focus : Boolean) {
        println("I ${if (focus) "got" else "lost"} focus.")
    }
}