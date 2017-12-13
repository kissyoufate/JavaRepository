package com.wanggang.hightStudy.aggregate;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * create by Gary Wong
 * 2017/12/13
 * class describetion : Map集合
 */
public class MapOfJava {

    //同为Collection接口下的具体实现类
    //有key : value
    //注意类型转换

    @Test
    public void testMap(){
        Map map = new HashMap();
        map.put("name","张扬");
        map.put("age",99);


        //遍历的几种方法

        //1.通过先取得所有的键,通过键来遍历
        for (Object object : map.keySet()){
            System.out.println("key :" + object + "---" + "value : " + map.get(object));
        }

        //2.Iterator 迭代器 通过Map.Entry 对象来获取
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println("key :" + entry.getKey() + "---" + "value : " + entry.getValue());
        }

        //3.推荐
        for (Object entry : map.entrySet()){
            Map.Entry e = (Map.Entry)entry;
            System.out.println("key :" + e.getKey() + "---" + "value : " + e.getValue());
        }

        //4.只拿出值
        for(Object object : map.values()){
            System.out.println("value : " + object);
        }
    }
}
