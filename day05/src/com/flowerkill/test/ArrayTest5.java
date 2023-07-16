package com.flowerkill.test;

import java.util.Random;

public class ArrayTest5 {
    public static void main(String[] args){
        /*
            需求：定义一个数组，存入1~5.要求打乱数组中所有数据的顺序
            难点：
            如何获取数组中的随机索引
        */

        int[] arr = {1,2,3,4,5};
        Random r = new Random();

        for(int i = 0; i < arr.length; i++){
            int RandomIndex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[RandomIndex];
            arr[RandomIndex] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
