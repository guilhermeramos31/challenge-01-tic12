package org.example

abstract class Validator {
    companion object {
        fun arrayListIsValid(arrayNumber: List<String>): Boolean {
            if (arrayNumber.size < 2) {
                throw IllegalArgumentException("The ArrayList has less than two elements.")
            }
            return true
        }

        fun formatInputIsValid(input: String?): Boolean {
            if (input.isNullOrBlank()) {
                throw IllegalArgumentException("The input is empty or null.")
            }
            return true
        }
    }
}