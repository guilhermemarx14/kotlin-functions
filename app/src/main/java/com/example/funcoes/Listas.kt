package com.example.funcoes

fun main() {
    /** Declare a list with the numbers 1, 2, ... , 99 **/
    val intList = List(99) { it + 1 }

    /** Filter the list to get only even numbers **/
    val even = intList.filter { it % 2 == 0 }
    println(even)

    /** Declare a list with 4 names **/
    val stringList = listOf("Manoel", "José", "Maria", "João")

    /** Print the names with a 'Hello' using map and forEach  **/
    stringList.map { "Hello $it!" }.forEach { println(it) }

}