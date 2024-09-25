package com.kotlin.kotlin_basic

object Base64Util {

    private const val RADIX = 10
    private const val CODEC = "1234567890"

    fun encode(value: Long): String {
        var tempValue = value
        val sb = StringBuffer()
        while (tempValue > 0) {
            sb.append(CODEC[(tempValue % RADIX).toInt()])
            tempValue /= RADIX.toLong()
        }
        return sb.toString()
    }
}