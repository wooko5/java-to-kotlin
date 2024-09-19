package com.kotlin.java_to_kotlin.part1._03;

public class JvmStaticExample {
    public static void main(String[] args) {
//        String hello = HelloClass.Companion.hello();
//        String hi = HiObject.INSTANCE.hi();
        String hello = HelloClass.hello();
        String hi = HiObject.hi();
    }
}
