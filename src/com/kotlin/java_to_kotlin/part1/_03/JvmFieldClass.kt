package com.kotlin.java_to_kotlin.part1._03

class JvmFieldClass {

    companion object {
        val id = 1L
        const val CODE = "FAMILY_CODE"
    }
}

object JvmFieldObject {
    val name = "jaeuk"
}

fun main() {
    val id = JvmFieldClass.id
    val name = JvmFieldObject.name
    println("id = $id")
    println("name = $name")
}