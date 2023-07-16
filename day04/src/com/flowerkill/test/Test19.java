package com.flowerkill.test;

public class Test19 {
    public static void main(String[] args){
        /*
            需求：给定两个整数，被除数和除数（都是正数，且不超过int的范围）。
            将两数相除，要求不使用乘法。除法和%运算符。
            得到商和余数。

        */

        int dividend = 50;
        int divisor = 6;
        int count = 0;
        while(dividend >= divisor){
            dividend -= divisor;
            count++;

        }
        System.out.println("商为：" + count);
        System.out.println("余数为：" + dividend);


    }
}
