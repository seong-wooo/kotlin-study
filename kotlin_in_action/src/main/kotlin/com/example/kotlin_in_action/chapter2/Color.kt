package com.example.kotlin_in_action.chapter2

fun main() {
    println(Color.ORANGE.rgb())
    println(Color.ORANGE.getMnemonic())
}
enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0);

    fun rgb() = (r * 256 + g) * 256 + b

    fun getMnemonic() =
        when (this) {
            Color.RED -> "Richard"
            Color.ORANGE -> "Of"
            Color.YELLOW -> "York"
            Color.GREEN -> "Gave"
        }
}