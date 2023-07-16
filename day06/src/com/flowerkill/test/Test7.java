package com.flowerkill.test;

public class Test7 {
    public static void main(String[] args){
        /*
            需求：定义一个方法copyOfRange(int[] arr,int from,int to)
            功能：将数组arr中从索引from（包含from）开始
            到索引to结束（不包含to）的元素复制到新数组中，将新数组返回

        */

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int[] newArr = copyOfRange(arr, 5,10);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
    public static int[] copyOfRange(int[] arr, int from, int to){
        int[] newArr = new int[to - from];
        int index = 0;
        for(int i = from; i < to; i++){
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }
}
