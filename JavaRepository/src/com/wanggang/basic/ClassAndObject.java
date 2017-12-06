package com.wanggang.basic;

/**
 * create by Gary Wong
 * 2017/12/6
 * class describetion : 对象和类的相关知识
 */
public class ClassAndObject {
    //ClassAndObject 为一个公开的类  一个类中可以有多个内部类 但只能有一个public修饰的公开类

    //↓ 以下三个对象为类的成员变量,在类中都可以使用
    //一个字符串对象
    String aObjectString;
    //一个int的基本数据对象
    int age;
    //一个字符串对象
    String color;

    /**
     * 一个方法
     */
    void doSomething(){
        System.out.println("类被创建了,并调用了 doSomething 方法");
    }

    //构造方法 含有参数
    public ClassAndObject(String aObjectString, int age, String color) {
        this.aObjectString = aObjectString;
        this.age = age;
        this.color = color;
        System.out.println("含参的构造方法被调用!");
    }

    //无参的构造方法
    public ClassAndObject() {
        System.out.println("无参的构造方法被调用");
    }

    public static void main(String[] args) {
//        ClassAndObject classAndObject = new ClassAndObject();
        ClassAndObject classAndObject = new ClassAndObject("一个字符串对象",18,"黄色");
        //成员变量直接使用 . 进行获取
        System.out.println(classAndObject.color);
    }
}
