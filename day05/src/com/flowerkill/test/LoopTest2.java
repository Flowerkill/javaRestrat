package com.flowerkill.test;

import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args){
        /*需求：键盘录入一个大于等于2的整数 x ，计算并返回 x 的平方根。
            结果只保留整数部分，小数部分舍去。
        */

        // 平方根   16的平方根是4
        //          4的平方根是2


        //10
        //1 * 1 = 1 < 10
        //2 * 2 = 4 < 10
        //3 * 3 = 9 < 10
        //4 * 4 = 16 > 10
        //10的平方根整数部分就是3


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于2的整数：");
        int number = sc.nextInt();
        for(int i = 1; i <= number; i++){
            if(i * i == number){
                System.out.println(i + "就是平方根的整数部分");
                break;
            }else if(i * i > number){
                System.out.println((i-1) + "就是平方根的整数部分");
                break;
            }
        }









    }
}
