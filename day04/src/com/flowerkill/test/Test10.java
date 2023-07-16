package com.flowerkill.test;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args){
        //使用switch语句
        /*需求：键盘录入星期数，输出工作热、休息日。
        * （1-5）工作日，（6-7）休息日*/

        Scanner sc = new Scanner(System.in);
        System.out.println("请录入星期数：");
        int week = sc.nextInt();
//        if(week >= 1 && week <= 7){
//            if(week >= 1 && week <= 5){
//                System.out.println("工作日");
//            }else{
//                System.out.println("休息日");
//            }
//        }

        switch(week){
            case 1,2,3,4,5 -> System.out.println("工作日");
            case 6,7 -> System.out.println("休息日");
            default -> System.out.println("没有这个星期");
        }


    }
}
