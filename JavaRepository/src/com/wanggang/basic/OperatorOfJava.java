package com.wanggang.basic;

/**
 * create by Gary Wong
 * 2017/12/6
 * class describetion : java中的运算符
 */
public class OperatorOfJava {
    public static void main(String[] args) {

        /*
        数学运算符
        关系运算符
        位运算符 (我在别的语言开发中几乎没有用过)
        短路 (多个运算符混合使用)
        赋值运算符 (几乎没怎么用)
        条件运算符 (三木运算符) ?:
        instanceof 运算符 (判断某个对象是否为某个类的对象)
        运算符优秀原则 (括号优先,先乘除后加减)
        */

        //1.数学运算符
        int a = 1 + 1;
        int b = 1 - 1;
        int c = 1 * 1;
        int d = 1 / 1;
        int e = 100%6;
        int f = 100;
        int g = 100;

        f --;
        System.out.println(f);
        g ++;
        System.out.println(g ++);

        //2.关系运算符
        /*
            == != > < >= <= 返回值为boolean类型
        */
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        
        //instanceof 运算符 判断某个对象是否为某个类的对象
        ClassAndObject classAndObject = new ClassAndObject();
        boolean b1 = classAndObject instanceof ClassAndObject;
        System.out.println(b1);
    }
}
