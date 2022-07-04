package com.example.funcoes

fun main() {
    val num1 = 5
    val num2 = 6

    /** Call calculator with the sum function **/
    println(calculator(num1, num2, ::sum)) // 11

    /** Call calculator with the times function **/
    println(calculator(num1, num2, ::times)) // 30
}


/** Declare a sum function **/
fun sum(num1: Int, num2: Int): Int {
    return num1 + num2
}

/** Declare a times function with a compact syntax **/
fun times(num1: Int, num2: Int) = num1 * num2

/** Declare a simple calculator as a high order function **/
fun calculator(num1: Int, num2: Int, operation: (Int, Int) -> Int): Int {
    return operation(num1, num2)
}

