package com.example.basickotlin

fun main() {
    println(searchElement(  27, mutableListOf (1,2,3,4,5,6,7,8,9,10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30)))
}
private fun searchElement(searchedElement: Int, numbers: MutableList<Int>): Int {
    var low = 0
    var high : Int = numbers.size - 1
    var i = 0
    while (low <= high) {
        i++
        println("Searched number: $1")
        val mid  = (low + high) / 2
        val cmp  = numbers [mid].compareTo(searchedElement)
        if (cmp < 0) {
            low =mid + 1
        } else if (cmp > 0) {
            low =mid-1
        } else {
            return numbers [mid]
        }
    }
    return -1
}