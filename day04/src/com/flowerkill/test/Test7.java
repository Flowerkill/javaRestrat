package com.flowerkill.test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        /*
            在实际开发中，多种情况判断时，会用到if的第三种格式：
            需求：
            商场都会有vip的会员制，根据不同的会员会有不同的折扣。
            假设商品总价为1000
            键盘录入会员级别，并计算出实际支付的钱
            会员1级：打9折
            会员2级：打8折
            会员3级：打7折
            非会员：不打折，要打也是打骨折



        */
        //定义变量记录总价：
        int price = 1000;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入会员等级：");
        int vip = sc.nextInt();
        if (vip == 1) {
            double result = price * 0.9;
            System.out.println("原价" + price + "元，您是1级会员打9折实际支付：" + result + "元");
        } else if (vip == 2) {
            double result = price * 0.8;
            System.out.println("原价" + price + "元，您是2级会员打8折实际支付：" + result + "元");

        } else if (vip == 3) {
            double result = price * 0.7;
            System.out.println("原价" + price + "元，您是3级会员打7折实际支付：" + result + "元");

        }else{
            System.out.println("原价 1000元 您不是会员不打折，您要打折咱给你打骨折，请支付1000元。");

        }
    }
}
