package com.kotlin_basic

import kotlin.math.max
import kotlin.math.min
import kotlin.random.Random


const val number = 20 // 클래스 외부에 상수 선언가능(밑의 main함수보다 우선적으로 생성됨 == static)

fun main() {
    //print문
    println("Hello World!")

    //변수 선언(타입 고정, 타입을 명시하고 싶지않으면 작성하지 않으면 됨)
    var i: Int = 10
    var name: String = "jaeuk"
    var point: Double = 3.3

    //상수
    val num = 20
//    num = 30 (재할당 불가능)

    //형변환
    var j = 20
    var k = 20L
    k = j.toLong()
    j = k.toInt()
    println()

    //문자열
    println(name.uppercase())
    println(name.lowercase())
    println("제 이름은 " + name + " 입니다.")
    println("제 이름은 $name 입니다.")
    println("제 이름은 ${name}입니다.")

    //max, min
    i = 10
    j = 20
    println(max(i, j))
    println(min(i, j))

    //랜덤
    println(Random.nextInt(0, 100)) // 0~99

    //키보드 입력
//    var sc = Scanner(System.`in`)
//    var sc1 = sc.nextInt()
//    var sc2 = sc.next()
//    println(sc1)
//    println(sc2)


    //조건문
    var iff = 5

    if (iff > 10) {
        println("10보다 크다")
    } else if (iff > 5) {
        println("5보다 크다")
    } else {
        println("")
    }

    var result = if (iff > 10) true else false
    println(result)

    //반복문
    val items = listOf(1, 2, 3, 4, 5)
    for (item in items) {
        println(item)
    }
    items.forEach { item ->
        println(item)
    }

    for (i in 0..items.size - 1) {
        println(items[i])
    }

//    val mutableList : MutableList<Int> = mutableListOf<Int>(1, 2, 3, 4, 5)
    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    mutableList.add(6)
    mutableList.remove(3)
    println(mutableList)


    //Array
    val array = intArrayOf(1, 2, 3)
    array[0] = 6

    try {
        var arr = array[4]
    } catch (e: ArrayIndexOutOfBoundsException) {
        println(e)
    }

    //null safety
    var nullSafey: String? = null
    var test: String = ""
    if (nullSafey != null) {
        test = nullSafey
    }
    name?.let {
        println(it)
    }

    //함수
    fun sumV1(a: Int, b: Int): Int {
        return a + b
    }

    fun sumV2(a: Int, b: Int) = a + b

    //클래스
    val john = Person("John", 30)
    println(john.toString())
    println(john.hobby)
}

class Person(
    val name: String,
    var age: Int
) {
    var hobby = "축구"
        private set //Person의 속성인 hobby의 setter를 제어할 수 있음
        get() = "취미 : $field"

    init {
        println("init")
    }
}

class Agent(
    private val name: String,
    var age: Int
)