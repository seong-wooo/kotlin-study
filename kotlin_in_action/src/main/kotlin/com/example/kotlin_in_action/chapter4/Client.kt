package com.example.kotlin_in_action.chapter4

class Client(val name: String, val postalCode: Int) {
    override fun toString(): String = "Client(name=$name, postalCode=$postalCode)"

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client) return false
        return name == other.name && postalCode == other.postalCode
    }

    override fun hashCode(): Int = name.hashCode() * 31 + postalCode
}

data class Client2(val name: String, val postalCode: Int)

fun main() {
    val client1 = Client("박성우", 9695)
    val client2 = Client("박성우", 9695)
    println(client1)
    println(client1 == client2)
    println(client1 === client2)
    val set1 = hashSetOf(client1)
    println(set1.contains(client2))



    val client3 = Client2("박성우", 9695)
    val client4 = Client2("박성우", 9695)
    println(client3)
    println(client3 == client4)
    println(client3 === client4)


    val set2 = hashSetOf(client3)
    println(set2.contains(client4))


}