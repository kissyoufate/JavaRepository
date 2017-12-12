package com.wanggang.faceObject.interfaceinterface;

/**
 * create by Gary Wong
 * 2017/12/12
 * class describetion : none
 */
public class PeopleDaoImpl implements PeopleDao {
    //1.实现(继承)PeopleDao接口 (接口可以多继承)


    //2.重写相关的方法
    @Override
    public void sayHello(String sayString) {
        System.out.println(sayString);
    }
}
