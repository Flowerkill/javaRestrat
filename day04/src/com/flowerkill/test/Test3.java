package com.flowerkill.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args){
        /*需求：键盘录入一个整数，表示身上的钱。
        * 如果大于等于100快，就吃网红餐厅。
        * 否则，就吃经济实惠的沙县小吃。
        * */


        Scanner sc = new Scanner(System.in);
        System.out.println("请问你身上有多少前？");
        int manny = sc.nextInt();
        if(manny >= 100){
            System.out.println("吃网红餐厅！");
        }else{
            System.out.println("吃沙县小吃！");
        }


    }
}
