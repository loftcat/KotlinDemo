package com.loftcat.demo

/**
 *
 * @author Administrator
 * @date 2017-06-21 17:01
 */
fun main(args: Array<String>) {

    var x = -1

    if (x in 1..3)
        println(x)

    for (a in 1..10)
        println(a)

    var y = arrayListOf<String>()
    y.add("a")
    y.add("b")
    y.add("c")

    if (x !in 0..y.size)
        println("!n")

    if ("a" in y)
        println(y[0])


}