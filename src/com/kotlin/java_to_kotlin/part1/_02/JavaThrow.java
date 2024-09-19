package com.kotlin.java_to_kotlin.part1._02;

import java.io.IOException;

public class JavaThrow {

    public void throwIOException() throws IOException {
        throw new IOException("checked io-exception!!");
    }

    public static void main(String[] args) {
        JavaThrow javaThrow = new JavaThrow();
        try {
            javaThrow.throwIOException();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
