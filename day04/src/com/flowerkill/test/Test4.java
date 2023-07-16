package com.flowerkill.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args){
        //在实际开发中，如果要根据两种不同的情况来执行不同的代码，就需要用到if的第二种格式。
        /*
            需求：
            假设，用户在超市实际购买，商品总价为：600元。
            键盘录入一个整数表示用户实际支付的前。
            如果付款大于等于600，表示支付成功。否则支付失败。
        */


        Scanner sc = new Scanner(System.in);
        System.out.println("请支付600快：");
        int manny = sc.nextInt();
        if(manny >= 600){
            System.out.println("支付成功！！！");
        }else{
            System.out.println("支付失败！！！");
        }





    }
}
