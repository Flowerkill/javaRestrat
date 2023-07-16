package com.flowerkill.test;

import java.util.Random;

public class ArrayTest3 {
    public static void main(String[] args){
        /*
            需求：生成10个1~100之间的随机数存入数组。
            1.求出所有数据的和
            2.求出所有数据的平均数
            3.统计有多少个数据比平均值小
        */

        Random r = new Random();
        int[] arr = new int[10];
//        System.out.println(arr.length);
        for(int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(100) + 1;
//            System.out.println(arr[i]);
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("数组中所有数据的和为：" + sum);
        int avg = sum / arr.length;
        System.out.println("数组中平均数为：" + avg);

//        System.out.println(avg);
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < avg)
                count++;
        }
        System.out.println("比数据平均值小的有" + count + "个");
    }
}
