package com.zest.classloader_loader.classload;

public class Test_8 {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.zest.classloader_loader.classload.Test_8_A");

        System.out.println("end");
    }
}

class Test_8_A {
    static {
        System.out.println("Test_8_A Static Block");
    }
}