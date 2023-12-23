package org.example

abstract class Calculator {
    companion object {
        fun sum(arrayNumber: ArrayList<Int>): Int{

            var sumValue: Int = 0
            arrayNumber.forEach{
                    number -> sumValue += number
            }

            return sumValue
        }
    }
}