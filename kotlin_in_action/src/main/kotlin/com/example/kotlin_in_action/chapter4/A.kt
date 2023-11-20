package com.example.kotlin_in_action.chapter4

class A private constructor(val name : String) {

    companion object B : Comparator<String> {
        fun create(name: String): A = A(name)

        fun bar() = println("Companion object called")
        override fun compare(o1: String?, o2: String?): Int = 0

    }
}

fun foo(comp: Comparator<String>) : Int = comp.compare("1", "2")

fun main() {
    A.bar()
    val a = A.create("박성우")
    println(a)
//--------------------
    A.B.bar()
    println(foo(A));
}