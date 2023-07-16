package com.flowerkill.test;

import java.util.Scanner;

public class Test18 {
    public static void main(String[] args){
        /*
            需求：给你一个整数 x 。
            如果 x 是一个回稳整数，打印true，否则，返回false。
            解释：回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
            例如：121是回文，而123不是。
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int x = sc.nextInt();
        int temp = x;
        int num = 0;
        while(temp != 0){
            int ge = temp % 10;
            temp /= 10;
             num = num * 10 + ge;

        }

        System.out.println(x == num);


    }
}
