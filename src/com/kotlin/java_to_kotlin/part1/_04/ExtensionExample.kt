package com.kotlin.java_to_kotlin.part1._04

fun String.first(): Char {
    return this[0]
}

fun String.addFirst(char: Char): String {
    return char + this.substring(0)
}

fun main() {
    println("ABCD".first())
    println("ABCD".addFirst('E'))
}