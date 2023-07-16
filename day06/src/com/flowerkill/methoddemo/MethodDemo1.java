package com.flowerkill.methoddemo;

public class MethodDemo1 {
    public static void main(String[] args){

        //方法调用：
        method1(1,2);
    }


    //方法定义
    public static void method1(int a, int b){
        int c = a + b;
        System.out.println(c);
    }
}
