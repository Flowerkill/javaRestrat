package com.flowerkill.test;

public class Test17 {
    public static void main(String[] args){
        /*
            需求：世界最高山峰是珠穆朗玛峰（8844.43米 = 8844430毫米），
            假如我有一张足够大的纸，它的厚度是0.1毫米。
            请问，我折叠多少次，可以折成珠穆朗玛峰的高度？
        */

        //定义变量记录珠穆朗玛峰的高度
        double height = 8844430;
        //定义变量记录纸张的厚度
        double paper = 0.1;
        //定义变量记录折叠的次数
        int count = 0;

        while(paper < height){
            paper *= 2;
            count++;
        }
        System.out.println(count);

    }
}
