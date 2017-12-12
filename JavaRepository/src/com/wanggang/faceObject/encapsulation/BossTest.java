package com.wanggang.faceObject.encapsulation;

/**
 * create by Gary Wong
 * 2017/12/12
 * class describetion : none
 */
public class BossTest {

    public static void main(String[] args) {
        Boss boss = new Boss();

        //通过set设值
        boss.setName("张扬");
        boss.setAge(18);

        System.out.println(boss);

        //通过get来拿到设置的值
        System.out.println(boss.getName());
    }
}
