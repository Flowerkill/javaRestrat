package com.flowerfkill.test;

public class Test4 {
    public static void main (String[] args){
        //需求：一座寺庙里住着三个和尚，已知他们的身高分别为150cm、210cm、165cm,
        //请用程序获取这三个和尚的最高身高

        int a = 150;
        int b = 210;
        int c = 165;

        int maxheight = a > b ? a : b;
        maxheight = maxheight > c ? maxheight : c;

        System.out.println("这三个和尚的最高身高为：" + maxheight + "cm");

    }
}
