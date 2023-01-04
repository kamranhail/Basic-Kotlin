package com.example.basickotlin

import java.security.Key

fun main()
{

slice()
}

fun grooping()
{
    val numbers = listOf("one", "two", "three", "four", "five")
    //   println(numbers.groupBy { 1..numbers.size })
    // println(numbers.groupBy { it.first().uppercase () })
    //  println(numbers.groupBy (keySelector = { it.first() }, valueTransform = { it.uppercase () }))


    //  println(numbers.groupBy (keySelector = {it.first().uppercase()}, valueTransform = { it.uppercase () }))
    val data =numbers.groupBy (keySelector = {it.first().uppercase()}, valueTransform = { it.uppercase () })
    val ff=data.filter { it.key.startsWith('T')} .values
    println(ff)

}

fun slice()
{
    val numbers: List<String> = listOf("one", "two", "three", "four", "five", "six")
    println(numbers.slice( 1 .. 3))
    println(numbers.slice(  0..  4 step 2))
    println(numbers.slice (setOf (3, 5, 0)))
    println("\n")

    println(numbers.take( 3))
    println(numbers.takeLast(3))
    println(numbers.drop( 1))
    println(numbers.dropLast(  5))

    println("\n")
    println(numbers.takeWhile { !it.startsWith( "f") })
    println(numbers. takeLastWhile{ it != "three" })
            println(numbers.dropWhile { it.length == 3 })
            println(numbers.dropLastWhile { it.contains (  "1") })


    val nums = (0 ..  13).toList()
    println(nums.chunked ( 3))
    println(nums.chunked ( 3) { it.sum()})
    print("")
    println(nums.windowed ( 3))

}