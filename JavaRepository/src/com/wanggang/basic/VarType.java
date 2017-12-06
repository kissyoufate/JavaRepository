package com.wanggang.basic;

/**
 * create by Gary Wong
 * 2017/12/6
 * class describetion : 变量类型
 */
public class VarType {
    //所有的变量都需要声明才可以分配内存空间,再进行使用
    //1.实例变量 (类被创建时,值会跟着确定)
    int a,b,c;
    int d = 100;
    String string = "这是一个字符串";
    char aChar = 'a';

    //2.类变量(静态变量) (不管类被创建多少次,只有一个静态对象的拷贝)
    static String staticString = "这是一个静态字符串";

    public void testMethod(){
        //3.局部变量(只能在{}这个作用域中使用)
        String myString = "局部变量字符串";
    }
}
