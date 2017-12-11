package com.wanggang.faceObject.extendsextends;

/**
 * create by Gary Wong
 * 2017/12/11
 * class describetion : 这里是继承Father类的子类
 */
public final class Son extends Father implements FatherInterface {

    @Override
    public void mustImplMethod() {
        System.out.println("这里是子类必须实现的接口方法");
    }

    @Override
    public void fatherMethod() {
        //调用父类的方法执行语句
        super.fatherMethod();

        //子类重写父类的方法
        System.out.println("这里是子类的执行代码块");
    }
}
