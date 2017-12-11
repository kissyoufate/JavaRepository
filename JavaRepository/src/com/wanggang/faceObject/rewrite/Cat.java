package com.wanggang.faceObject.rewrite;

/**
 * create by Gary Wong
 * 2017/12/11
 * class describetion : Cat 类 继承 Animal 类
 */
public class Cat extends Animal {

    /**
     * 重写eat()方法
     */
    @Override
    public void eat() {
        super.eat();
        System.out.println("猫可以吃鱼");
    }

//    (1)方法重载是一个类中定义了多个方法名相同,而他们的参数的数量不同或数量相同而类型和次序不同,则称为方法的重载(Overloading)。
//    (2)方法重写是在子类存在方法与父类的方法的名字相同,而且参数的个数与类型一样,返回值也一样的方法,就称为重写(Overriding)。
//    (3)方法重载是一个类的多态性表现,而方法重写是子类与父类的一种多态性表现。

    public void eat(String foodString){
        System.out.println("方法overload 猫要吃 : " + foodString);
    }
}
