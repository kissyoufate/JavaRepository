package com.wanggang.faceObject.extendsextends;

/**
 * create by Gary Wong
 * 2017/12/11
 * class describetion : none
 */
public class ExtendsTest {

//    子类拥有父类非private的属性，方法。
//
//    子类可以拥有自己的属性和方法，即子类可以对父类进行扩展。
//
//    子类可以用自己的方式实现父类的方法。

    //final 关键字可以指定类不能被继承和重写 如本包中的Son类,指定不能被继承

    //测试继承,在子类中拿父类的东西
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.publicFatherName);
        son.fatherMethod();
        son.mustImplMethod();
    }
}
