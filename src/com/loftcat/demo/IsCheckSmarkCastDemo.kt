package com.loftcat.demo

/**
 * Is判断
 * @author Administrator
 * @date 2017-06-21 16:45
 */
fun main(args: Array<String>) {
    println(getStringLength(10))
    println(getStringLength("凹凸曼"))
}


fun getStringLength(a: Any): Int {
    if (a is String)
        return a.length
    else
        return 0
}