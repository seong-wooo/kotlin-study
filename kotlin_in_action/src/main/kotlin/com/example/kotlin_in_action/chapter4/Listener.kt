package com.example.kotlin_in_action.chapter4

import java.awt.event.MouseAdapter

fun main() {

    val adapter = object : MouseAdapter() {
        override fun mouseClicked(e: java.awt.event.MouseEvent?) {
            super.mouseClicked(e)
        }

        override fun mouseEntered(e: java.awt.event.MouseEvent?) {
            super.mouseEntered(e)
        }
    }
    println(adapter.javaClass)
}