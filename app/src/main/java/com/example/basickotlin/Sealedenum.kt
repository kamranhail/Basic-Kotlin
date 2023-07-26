package com.example.basickotlin

fun main()
{



}

enum class FinalResult {
    SUCCESS,
    FAILURE,
    ERROR
}



sealed class  Status(msj : String)
{
fun show (msjj: String)
{
    println("the massege is :  $msjj")
}

}