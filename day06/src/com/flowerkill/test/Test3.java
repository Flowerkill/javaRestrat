package com.flowerkill.test;

public class Test3 {
    public static void main(String[] args) {
        /*需求：使用方法重载的思想，设计比较两个整数是否相同的方法
         * 要求：兼容全整数类型（byte,short,int,long）*/

    }

    public static boolean compare(int a, int b) {
        return a == b;
    }

    public static boolean compare(byte a, byte b) {
        return a == b;
    }

    public static boolean compare(short a, short b) {
        return a == b;
    }

    public static boolean compare(long a, long b) {
        return a == b;
    }


}
