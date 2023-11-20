package com.example.kotlin_in_action.chapter4

object Payroll {
    private val allEmployees = arrayListOf<String>()

    fun addAll(vararg name: String) {
        allEmployees.addAll(name)
    }

    fun calculateSalary() {
        println(allEmployees)
    }
}

fun main() {
    Payroll.addAll("박성우", "박성우2")
    Payroll.calculateSalary()
}