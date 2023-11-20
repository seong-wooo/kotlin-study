package com.example.kotlin_in_action.chapter4

class User(_nickname: String) {
    val nickname : String

    init {
        nickname = _nickname
    }
}

fun main() {
    val user = User("성우")

}