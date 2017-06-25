package com.loftcat.demo

fun main(args: Array<String>) {

    Man("Eric").say()
}

class Man(val name: String) {

    fun say() {
        println("I AM $name")
    }

}

