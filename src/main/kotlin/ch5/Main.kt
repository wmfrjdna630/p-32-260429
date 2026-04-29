package com.back.ch5

fun main(args: Array<String>) {
    for(i in 0 until  5) {
        println("Count: ${i}")
    }

    for(i in 0 ..  4) {
        println("Count: ${i}")
    }

    val numbers = listOf(1, 2, 3, 4, 5)
    for(number in numbers) {
        println("Number: ${number}")
    }

    for(i in 4 downTo 0) {
        println("Count: ${i}")
    }

    for(i in 0 until 10 step 2) {
        println("Count: ${i}")
    }
}