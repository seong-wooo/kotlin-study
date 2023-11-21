package com.example.kotlin_in_action.chapter5

fun main() {
    println(alphabetWith())
    println(alphabetApply())
    println(alphabetBuildString())
}

fun alphabetWith(): String =
        with(StringBuilder()) {
            for (letter in 'A'..'Z') {
                append(letter)
            }
            append("\nNow I know the alphabet!")
            toString()
        }

fun alphabetApply(): String =
        StringBuilder().apply {
            for (letter in 'A'..'Z') {
                append(letter)
            }
            append("\nNow I know the alphabet!")
        }.toString()

fun alphabetBuildString(): String =
        buildString {
            for (letter in 'A'..'Z') {
                append(letter)
            }
            append("\nNow I know the alphabet!")
        }