package com.flowerkill.test;

//导包

import java.util.Random;
import java.util.Scanner;

public class LoopTest5 {
    public static void main(String[] args){
        //需求：程序自动生成一个1-100之间的随机数字，使用程序实现猜出这个数字是多少？
        //生成随机数要导包 Random

        //创建random对象
        Random r = new Random();

        //使用Random对象
        //括号里填范围，从零开始到填的数字-1结束，包左不包右
        // 0~99，题目要求1-100，所以后面加1

        int number = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

       while(true){
           System.out.println("请输入你猜的数字：");
           int guessNumber = sc.nextInt();
           if(guessNumber > number){
               System.out.println("猜大了");
           }else if(guessNumber < number){
               System.out.println("猜小了");
           }else{
               System.out.println("猜中了");
               break;
           }
       }
    }
}