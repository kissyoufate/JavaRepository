package com.wanggang.method;

/**
 * Created by 王刚 on 2017/12/7.
 * class description : java中的方法
 */
public class MethodOfJava {

    //1.方法 : 语句的集合,执行某些特性的操作
    //2.方法的特点 : 字符或_开头 ,包括 名字 传参,返回值,方法内容
    //3.方法可以被子类重载
    public static void main(String[] args) {
        System.out.println("这个语句也是一个方法");

        int number = getNumber(5);
        System.out.println(number);
    }

    public static int getNumber(int i){
        return i + 1;
    }
}
