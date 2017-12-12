package com.wanggang.faceObject.abstractabstract;

/**
 * create by Gary Wong
 * 2017/12/12
 * class describetion : 人类的 抽象 类
 */
public abstract class People {

    //1.和普通类一样 可以包含 成员变量 方法
    //2.*****不能实例化

    public String peopleName;
    private String propleSex;

    public void sayHello(){
        System.out.println("人类的抽象类 说 hello");
    }
}
