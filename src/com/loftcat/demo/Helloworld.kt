package com.loftcat.demo

fun main(args: Array<String>) {
    if (args.size == 0) {
        println("please insert args in common-line")
        return
    }
    println("Hello,${args[0]}")

    for (arg in args) {
        println("Hello,${args[0]}")
    }

}
