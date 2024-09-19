package com.kotlin.java_to_kotlin.part1

import java.time.LocalDate

class Student {
    var name: String? = null
    var birthDate: LocalDate? = null
    val age: Int = 10
    var grade: String? = null
        private set

    fun changeGrade(grade: String) {
        this.grade = grade
    }
}