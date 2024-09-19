package com.kotlin.java_to_kotlin.part1._02

import java.io.IOException

class KotlinThrow {
    fun throwIOException() {
        throw IOException("checked io-exception!!")
    }
}

fun main() {
    val javaThrow = JavaThrow()
    javaThrow.throwIOException()

    val kotlinThrow = KotlinThrow()
    kotlinThrow.throwIOException()
}