package com.wanggang.basic;

/**
 * create by Gary Wong
 * 2017/12/6
 * class describetion : java中的修饰符
 */
public class ModifierOfJava {

    //1.访问控制修饰符 private public protected(不可修饰类) default(缺省,可以不使用任何访问修饰符)
    private String myString = "这是一个私有字符串";
    public String publicString = "这是一个公开的字符串";
    protected String protectedString = "这是一个受保护的字符串";

    //2.非访问修饰符 static final(不可被继承和重写或重新定义) abstract(抽象) synchronized volatile (这两个用于线程相关)
    public static final int a = 10;

    //可以用于修饰方法
    public static void staticMethod(){
        System.out.println("公开的静态方法被执行");
    }

    //volatile 每次访问时枪支重新读取该修饰符修饰的变量 变化时会强制重写到共享内存,不同的线程中都是同一个值,且是最新的
}
