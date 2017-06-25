package com.loftcat.demo

fun main(args: Array<String>) {
    val language = if (args.isEmpty()) "EN" else args[0]
    println(when (language) {
        "TEST" -> "haha"
        else -> "ELSE"
    })
}