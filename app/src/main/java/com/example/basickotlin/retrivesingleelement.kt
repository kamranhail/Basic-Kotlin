package com.example.basickotlin

fun main() {
    val numbers  = listOf("one","two", "three", "four", "five")
    println(numbers.elementAt(  3))
    println(numbers.first())
    println(numbers. last())
    println("\n")
    println(numbers.first {it.length> 3 })
println(numbers. last { it.startsWith( "f") })
println(numbers.random())
println(numbers.isEmpty())
}

 fun  addregatefuns ()
 {
     val numbers= listOf(6, 10, 14, 4, 100)
     println("The sum is ${numbers.sum()}")
     println("The count is: ${numbers.count()}")
     println("The average is: ${numbers. average ()}")
     println("The max value is: ${numbers.maxOrNull()}")
     println("The min value is: ${numbers.minOrNull()}")
     println("The sum is: ${numbers.sumOf { it * 2 }}")
     
 }