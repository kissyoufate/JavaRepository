package com.wanggang.faceObject.rewrite;

/**
 * create by Gary Wong
 * 2017/12/11
 * class describetion : 动物的总父类
 */
public class Animal {

    /**
     * 总父类的一个方法,可以在子类中重写
     */
    public void eat(){
        System.out.println("动物都可以吃东西");
    }
}
