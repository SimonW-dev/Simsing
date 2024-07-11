package org.example

import kotlin.random.Random

fun main() {
    /**
     * Make a list of 10 random numbers
     * make a prompt for Input
     * search for the input number of the prompt
     * return the index where the number was found in the list
     */

    val randomList = List(10) { Random.nextInt(0, 10) }
    println("your random list is: $randomList")
}
