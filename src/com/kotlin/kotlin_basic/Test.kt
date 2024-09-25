package com.kotlin.kotlin_basic

import java.time.LocalDateTime
import java.time.ZoneOffset
import kotlin.math.pow

class Test {

}

fun main() {
    val encodeIdMaxValue = 10.0.pow(8).toLong()
    val mainDrivingUserId = 100L
    val getDelegateCode = { mainDrivingUserId: Long, generatedAt: LocalDateTime ->
        "${Base64Util.encode(generatedAt.toEpochSecond(ZoneOffset.of("+9")))}${Base64Util.encode(encodeIdMaxValue - mainDrivingUserId)}"
    }

    println("part1 == ${Base64Util.encode(LocalDateTime.now().toEpochSecond(ZoneOffset.of("+9")))}")
    println("part2 == ${Base64Util.encode(encodeIdMaxValue - mainDrivingUserId)}")
    println(getDelegateCode(mainDrivingUserId, LocalDateTime.now()))
}