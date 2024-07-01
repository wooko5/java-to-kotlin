package com.kotlin_basic

abstract class Animal {
    open fun move() {
        println("이동해라")
    }
}

interface Drawable {
    fun draw()
}

class Dog : Animal(), Drawable {
    override fun move() {
        println("성큼성큼")
    }

    override fun draw() {
        TODO("Not yet implemented")
    }
}

class Cat : Animal(), Drawable {
    override fun move() {
        println("사뿐사뿐")
    }

    override fun draw() {
        TODO("Not yet implemented")
    }
}

fun main() {
    val dog = Dog()
    val cat = Cat()
    println("dog == ${dog.move()}")
    println("cat == ${cat.move()}")
    myCallfunc(){
        println("호출해!!")
    }
}

//콜백함수
fun myCallfunc(callBack: (a : String) -> Unit) {
    println("start!!!!")
    callBack("111")
    println("end!!!!")
}