package com.wanggang.faceObject.polymorphic;

/**
 * create by Gary Wong
 * 2017/12/11
 * class describetion : 多态的测试类
 */
public class polymorphicTest {

    public static void main(String[] args) {
        //多态的测试

        //1.创建Animals
        Animals animals = new Dog();
        animals.run();

        //2.子类指向父类
        Dog dog = (Dog) animals;
        dog.runRun();
    }
}
