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

    val result = findIndex(randomList)
    println(result)

}

fun findIndex(randomList: List<Int>): MutableList<Int> {
    val list = mutableListOf<Int>()

    println("gimme a numba")
    val eingabe = readln().toInt()

    for (kaka in randomList.indices) {
        if (eingabe == randomList[kaka]) {
            list.add(kaka)
        }
    }
    return list
}



