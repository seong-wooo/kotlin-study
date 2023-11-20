package com.example.kotlin_in_action.chapter4

fun main() {
    val button = Button()
    button.click()
    button.showOff()
    button.setFocus(true)
}

class Button : Clickable, Focusable {
    override fun click() {
        println("click!")
    }

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}