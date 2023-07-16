package com.flowerkill.test;

import java.util.Scanner;

public class LoopTest3 {
    public static void main(String[] args){
        /*需求：键盘录入一个正整数 x ，判断该整数是否为一个质数*/

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正胜数：");
        int x = sc.nextInt();
        boolean flag = true;
        if(x == 1 || x == 2){
            System.out.println(flag);
        }else{
            for(int i = 2; i < x; i++){
                if(x % i == 0){
                    flag = !flag;
                    System.out.println(flag);
                    break;
                }
            }
            if(flag){
                System.out.println(flag);

            }
        }



    }
}
