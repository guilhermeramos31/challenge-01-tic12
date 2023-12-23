package org.example

fun main() {
    print("Enter numbers into the array separated by spaces: ")
    val inputNumbers = readln()
    val arrayListInt = Convert.stringToArrayListInt(inputNumbers)
    print("Sum result: ${arrayListInt?.let { Calculator.sum(it) }}")
}