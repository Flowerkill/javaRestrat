package com.flowerkill.skiploop;

public class SkiploopDome1 {
    public static void main(String[] args){
        /*跳转控制语句*/

        //1.跳过本次循环
        //  continue
        for(int i = 1; i <= 5; i++){
            if(i == 3){
                continue;
            }
            System.out.println("小老虎再吃第" + i + "个包子");

        }
        System.out.println("-----------------------------------------");
        //2.结束整个循环
        //  break
        for(int i = 1; i <= 5; i++){
            if(i == 3){
                break;
            }
            System.out.println("小老虎再吃第" + i + "个包子");

        }
    }
}
