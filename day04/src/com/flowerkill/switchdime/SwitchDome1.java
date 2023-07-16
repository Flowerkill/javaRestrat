package com.flowerkill.switchdime;

public class SwitchDome1 {
    public static void main(String[] args){
        //jdk12新特性：

        int number = 1;
//        switch(number){
//            case 1:
//                System.out.println("一");
//            case 2:
//                System.out.println("二");
//
//            case 3:
//                System.out.println("三");
//
//            default:
//                System.out.println("没有这个选项");
//
//        }


        switch(number){
            case 1 ->{
                System.out.println("一");
            }
            case 2 ->{
                System.out.println("二");
            }
            case 3 ->{
                System.out.println("三");
            }
            default ->{
                System.out.println("没有这个选项");

            }
        }

    }
}
