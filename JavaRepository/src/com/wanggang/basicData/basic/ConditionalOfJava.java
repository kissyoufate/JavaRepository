package com.wanggang.basicData.basic;

/**
 * create by Gary Wong
 * 2017/12/6
 * class describetion : java中的条件判断
 */
public class ConditionalOfJava {
    //1.if
    //2.if else
    //3.if else if else
    //4.switch case

    public static int a = 1;
    public static int b = 0;

    public static void main(String[] args) {
        if(a == b){
            System.out.println("a == b");
        }

        if (a == b){
            System.out.println("a == b");
        }else {
            System.out.println("a != b");
        }

        int e = 0;
        int f = 19;
        int g = 5;

        if (e == f){
            System.out.println("e != f");
        }else if (e == g){
            System.out.println("e != g");
        }else {
            System.out.println("efg都不相等");
        }

        switch (e){
            case 0:
            {
                System.out.println("e == 0");
            }
                break;
            case 1:
            {
                System.out.println("e == 1");
            }
                break;
        }
    }

}
