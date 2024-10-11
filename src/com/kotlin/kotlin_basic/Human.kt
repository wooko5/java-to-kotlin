package com.kotlin.kotlin_basic

import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

data class Human(
    var name: String?,
    val birthDate: LocalDate?
)

fun main() {
    val birthDate = LocalDate.of(1994, 6, 5).format(DateTimeFormatter.ofPattern("yyyy-MM-dd")).split("-")
    println(
        Period.between(
            LocalDate.of(birthDate[0].toInt(), birthDate[1].toInt(), birthDate[2].toInt()),
            LocalDate.now()
        ).years
    )
    println(birthDate)
}