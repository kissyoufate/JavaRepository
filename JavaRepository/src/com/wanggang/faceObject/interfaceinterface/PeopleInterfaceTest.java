package com.wanggang.faceObject.interfaceinterface;

/**
 * create by Gary Wong
 * 2017/12/12
 * class describetion : 接口的测试类
 */
public class PeopleInterfaceTest {

    public static void main(String[] args) {
        //1.使用实现类来new 接口
        PeopleDao peopleDao = new PeopleDaoImpl();

        peopleDao.sayHello("你好");
    }
}
