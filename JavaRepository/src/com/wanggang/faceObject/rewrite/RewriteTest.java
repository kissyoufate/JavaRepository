package com.wanggang.faceObject.rewrite;

/**
 * create by Gary Wong
 * 2017/12/11
 * class describetion : 重写的测试类
 */
public class RewriteTest {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Cat cat = new Cat();
        cat.eat();
        cat.eat("老鼠");
    }
}
