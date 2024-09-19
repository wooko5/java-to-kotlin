package com.kotlin.java_to_kotlin.part1._03

class HelloClass {

    companion object {
        @JvmStatic
        fun hello() = "hello"
    }
}

object HiObject {
    @JvmStatic
    fun hi() = "hi"
}

fun main() {
    val hello = HelloClass.hello()
    val hi = HiObject.hi()
    println("HelloClass.hello() == $hello")
    println("HiObject.hi() == $hi")
}