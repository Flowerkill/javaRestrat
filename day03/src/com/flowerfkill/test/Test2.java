package com.flowerfkill.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args){
        //数字6
        /*
        需求：
            数字6是一个真正伟大的数字，键盘录入两个整数
            如果其中一个为6，最终结果输出true
            如果他们的和为6的倍数，最终结果输出true
            其他情况都是false


        */
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入两个整数：");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        boolean flag = number1 == 6 || number2 == 6 || (number1 + number2) % 6 == 0;

        System.out.println(flag);



    }
}
