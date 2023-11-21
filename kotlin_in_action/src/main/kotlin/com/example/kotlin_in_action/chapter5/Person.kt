package com.example.kotlin_in_action.chapter5

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 29), Person("박성우", 26))
    findTheOldest(people)
    println(people.maxBy { it.age })
    println(people.maxBy(Person::age))
    println(people.maxBy{p -> p.age})

    val groupBy1 = people.groupBy { it.age }
    println(groupBy1)

    val groupBy2 = people.groupBy { it.name.first() }
    println(groupBy2)
}

data class Person(val name: String, val age: Int) {
}

fun findTheOldest(people: List<Person>) {
    var maxAge = 0
    var theOldest: Person? = null
    for (person in people) {
        if (person.age > maxAge) {
            maxAge = person.age
            theOldest = person
        }
    }
    println(theOldest)
}
