package com.wanggang.faceObject.encapsulation;

/**
 * create by Gary Wong
 * 2017/12/12
 * class describetion : java中的封装特性简单演示
 */
public class Boss {

    //1.有两个私有的成员变量

    private String name;
    private Integer age;

    //2.通过公开的set和get方法给外界访问和设值

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
