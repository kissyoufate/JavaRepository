package com.wanggang.hightStudy.aggregate;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * create by Gary Wong
 * 2017/12/13
 * class describetion : Array集合
 */
public class ArrayOfJava {
    //1.集合框架的结构
    //Collection(接口)->List->ArrayList
    //Map(接口)->HashMap
    //Collections (工具类算法,提供各种方法)

    //Set 与上述的集合框架一样,只是不保存重复的值,而且无序

    //2.迭代器 Iterator

    @Test
    public void testInterator(){
        //初始化一个集合
        List lists = new ArrayList();

        //向集合中添加元素
        lists.add("你好");
        lists.add("世界");

        //迭代的几种方式

        //1)
        for(Object object : lists){
            System.out.println(object);
        }

        //2)将集合转化为数组进行for循环
        Object[] objects = new Object[lists.size()];
        lists.toArray(objects);
        for (int i=0;i<objects.length;i++){
            System.out.println(objects[i]);
        }

        for(int i=0;i<lists.size();i++){
            System.out.println(lists.get(i));
        }

        //3)迭代器
        Iterator iterator = lists.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
