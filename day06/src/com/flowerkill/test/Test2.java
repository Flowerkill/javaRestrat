package com.flowerkill.test;

public class Test2 {
    //需求：定义一个方法，求园的面积，将结果在方法中打印。
    //目标：根据不同的需求，选择定义无参的方法，还是带参数的方法
    public static void main(String[] args){
        getArea(5);
    }
    public static void getArea(double radius){
        double result = radius * radius * 3.14;
        System.out.println(result);
    }
}


