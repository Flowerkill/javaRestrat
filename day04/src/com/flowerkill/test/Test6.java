package com.flowerkill.test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args){
        /*
            根据不同的分数送不同的礼物。
            如果是95~100分，送自行车一辆。
            如果是90~94分，游乐场玩一天
            如果是80~89分，送变形金刚一个
            如果是80分以下，揍一顿



        */


        Scanner sc  = new Scanner(System.in);
        System.out.println("请输入分数：");
        int score = sc.nextInt();
        if(score >= 0 && score <= 100){
            if(score >=95){
                System.out.println("送自行车一辆。");
            }else if(score >= 90 && score < 95){
                System.out.println("游乐场玩一天");
            }else if(score >= 80 && score < 90){
                System.out.println("送变形金刚一个");

            }else{
                System.out.println("揍一顿");

            }

        }else{
            System.out.println("当前输入的成绩不合法");
        }



    }
}