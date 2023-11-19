package com.example.kotlin_in_action.chapter3

fun main() {
    val phoneNumber = "010.1234.56-78"
    println(phoneNumber.split("\\."))
    println(phoneNumber.split("\\.".toRegex()))
    println(phoneNumber.split("\\.|-".toRegex()))
    println(phoneNumber.split("\\.|-"))
    println(phoneNumber.split(".", "-"))

    println(parsePath("/Users/yole/kotlin-book/chapter.adoc"))
    println(parsePathRegex("/Users/yole/kotlin-book/chapter.adoc"))
}

fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")
    println("Dir: $directory, name: $fileName, ext: $extension")
}

fun parsePathRegex(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
        val (directory, fileName, extension) = matchResult.destructured
        println("Dir: $directory, name: $fileName, ext: $extension")
    }
}