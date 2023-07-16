package com.flowerkill.test;

public class Test6 {
    public static void main(String[] args) {
        /*定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处*/
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(contains(arr, 99));
    }

    public static boolean contains(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return true;
            }
        }
        return false;
    }
}
