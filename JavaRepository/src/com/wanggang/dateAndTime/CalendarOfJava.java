package com.wanggang.dateAndTime;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by 王刚 on 2017/12/7.
 * class description : Calendar GregorianCalendar(公历) 类
 */
public class CalendarOfJava {


    public static void main(String[] args) {
        //1.实例化 Calendar类 (默认为当前时间)
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        //2.设置Calendar的时间
        calendar.set(2017,5,8);


        //3.获取calendar对象中的年月日
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);

        //4.公历 判断是否闰年
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        boolean b = gregorianCalendar.isLeapYear(2017);
        System.out.println(b);
    }
}
