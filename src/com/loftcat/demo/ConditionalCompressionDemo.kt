package com.loftcat.demo

fun main(args: Array<String>) {
    println(max(10, 5))
}

fun max(a: Int, b: Int) = if (a > b) a else b

