package com.kotlin.kotlin_basic

import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId

fun main() {
    val instantTime = Instant.now()
    println("${instantTime} ==> instantTime")
    println("${LocalDateTime.ofInstant(instantTime, ZoneId.of("Asia/Seoul"))} ==> UTC+9")
    println("${LocalDateTime.ofInstant(instantTime, ZoneId.of("UTC"))} ==> UTC")

    val currentDateTime = LocalDateTime.ofInstant(instantTime, ZoneId.of("UTC"))
    println(currentDateTime)

    println(LocalDateTime.now().plusDays(7L))
}