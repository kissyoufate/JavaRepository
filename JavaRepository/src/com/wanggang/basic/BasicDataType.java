package com.wanggang.basic;

/**
 * create by Gary Wong
 * 2017/12/6
 * class describetion : java的基本数据类型
 */
public class BasicDataType {
    //1.内置数据类型 byte short int long float double char boolean
    //2.引用类型
    //3.常量
    //4.类型转换 (只能往低经度的转换 如 double => int)
    //5.强制类型转换

    //这些都是定义的常量
    final double PI = 3.14159;
    int a = 10086;
    int b = 10010;

    public static void main(String[] args) {
        //对象,数组 等等都为引用数据类型 默认值为 null
        ClassAndObject classAndObject = null; //此为引用的 ClassAndObject 的对象 为引用数据类型 值为null

        ClassAndObject classAndObject1 = new ClassAndObject();//此为引用的 ClassAndObject 的对象 为引用数据类型 并实例化了对象

        //强制类型转换
        double doubleMath = 4.1111115;
        int intMath = (int)doubleMath;
        System.out.println(intMath);//4
    }
}
