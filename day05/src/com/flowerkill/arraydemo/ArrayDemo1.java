package com.flowerkill.arraydemo;

public class ArrayDemo1 {
    public static void main(String[] args){
        /*
            数组array格式：
            静态初始化
            完整格式：
            数据类型[] 数组名 = new 数据类型[]{元素1，元素2，元素3...};
            简化格式：
            数据类型[] 数组名 = {元素1，元素2...}；
        */


        //需求1：定义数据存储5个学生的年龄
        int[] arr1 = new int[]{11,12,13,14,15};
        int[] arr2 = {11,12,13,14,15};
        //需求2：定义数组存储3个学生的姓名
        String[] arr3 = new String[]{"zhangsan","lisi","wangwu"};
        String[] arr4 = {"zhangsan","lisi","wangwu"};

        //需求3：定义数组存储4个学生的身高
        double[] arr5 = new double[]{1.92,1.30,1.43,1.70};
        double[] arr6 = {1.92,1.30,1.43,1.70};
    }
}
