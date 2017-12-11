package com.wanggang.faceObject.extendsextends;

/**
 * create by Gary Wong
 * 2017/12/11
 * class describetion : 用于测试java中的继承 这里是父类
 */
public class Father {

    //私有 ,子类不能拿到
    private String privateFatherName = "私有父亲的名字";

    //公共的,子类可以取到
    public String publicFatherName = "公开的父亲的名字";

    public void fatherMethod(){
        System.out.println("这里是父亲类中的一个测试方法");
    }
}
