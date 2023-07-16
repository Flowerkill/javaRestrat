package com.flowerkill.test;

public class Test1 {
    public static void main(String[] args){
        // 需求：定义一个方法，求长方形的周长，将结果在方法中打印。

        //目标：根据不同的需求，选择定义无参的方法，还是带参数的方法
        getLength(5,9);

    }
    public static void getLength(double len, double wight){
        double result = (len + wight) * 2;
        System.out.println("该长方形的周长为：" + result);
    }


}
