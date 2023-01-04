package com.example.basickotlin


fun main() {
    val numbers  = mutableListOf<Int> (2,5,1, 40, 20, 100, 60)
    numbers.sorted().forEach { println(it) }
    val laptops = mutableListOf(
    Laptop ( "Dell",  2021,  4, 600),
    Laptop( "Acer",  2020,  8,  800),
    Laptop ( "Apple",  2022, 16,  1000))

    println("\n")
    laptops.sorted ().forEach { println(it) }
    println("\n")
    laptops.sortedWith (Comparatorram()).forEach { println(it) }
    println("\n")
    laptops.sortedWith (ComparatorYear()).forEach { println(it) }
    // we can use lamda fun  istead of makinf classes for year and ram  as i written below

    laptops.sortedWith (compareBy { it.price }).forEach { println(it) }

    laptops.sortedBy  { it.ram }.forEach { println(it) }
    laptops.sortedWith (compareBy<Laptop> { it.year}.thenBy { it.price }. thenBy{ it.ram}).forEach { println(it) }


}
data class Laptop (val brand: String, val year: Int, val ram: Int, val price: Int): Comparable <Laptop> {
    override fun compareTo (other: Laptop): Int {
        return if (this.price > other.price) {
            println("In if statement: Swapping ${this.brand} with ${other.brand}")
                1
            } else if (this.price < other.price) {
                    println("In if statement: Swapping ${this.brand} with ${other.brand}")
                    -1
            } else {
        0
        }
    }
}

class Comparatorram: Comparator<Laptop> {
    override fun compare (laptop1: Laptop, laptop2: Laptop): Int{
        return if (laptop1.ram > laptop2.ram) {
            return 1
        } else if (laptop1.ram < laptop2.ram) {
            return -1
        } else {
            return 0
        }
    }}
class ComparatorYear: Comparator<Laptop> {
    override fun compare (laptop1: Laptop, laptop2: Laptop): Int{
        return if (laptop1.year > laptop2.year) {
            return 1
        } else if (laptop1.year < laptop2.year) {
            return -1
        } else {
            return 0
        }
    }}