package com.wanggang.faceObject.abstractabstract;

/**
 * create by Gary Wong
 * 2017/12/12
 * class describetion : none
 */
public class AbstractTest {

    public static void main(String[] args) {
        //直接实例化抽象类 People 不行
//        People people = new People();  错误

        //实例化抽象类的子类
        Student student = new Student();
        student.sayHello();
    }
}
