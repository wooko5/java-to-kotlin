package com.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinJavaSpringApplication

fun main(args: Array<String>) {
    runApplication<KotlinJavaSpringApplication>(*args)
}