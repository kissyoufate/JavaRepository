package com.wanggang.mathAndNumber;

/**
 * create by Gary Wong
 * 2017/12/6
 * class describetion : java中的Math类
 */
public class MathOfJava {
    //Math的常用方法
    //1.随机数

    /**
     * 获取一个100以内的随机数
     */
    public static int getRandomMath(){
        return (int) Math.ceil(Math.random()*100);
    }

    public static void main(String[] args) {
        int randomMath = getRandomMath();
        System.out.println(randomMath);
    }
}
