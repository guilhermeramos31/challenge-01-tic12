package org.example

abstract class Convert {

    companion object {
        fun stringToArrayListInt(input: String?): ArrayList<Int>? {
            val arrayListString = input.toString().split(" ")
            try {
                if (Validator.formatInputIsValid(input) && Validator.arrayListIsValid(arrayListString)){
                    val formattedArrayList = ArrayList<Int>()
                    arrayListString.forEach { element ->
                        formattedArrayList.add(element.toInt())
                    }
                    return formattedArrayList
                }
            } catch (e: Exception) {
                print(e.message)
            }
            return null
        }
    }
}