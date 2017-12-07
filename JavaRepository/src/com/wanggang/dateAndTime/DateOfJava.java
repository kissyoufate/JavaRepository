package com.wanggang.dateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 王刚 on 2017/12/7.
 * class description : java中的Date类
 */
public class DateOfJava {

    //1.返回1970 至今的毫秒数
    private static long timeLong = new Date().getTime();

    public static void main(String[] args) {
        System.out.println(timeLong);

        //2.获取格式化的时间
        String timeString = new Date().toString();
        System.out.println(timeString);

        //3.指定格式来格式化时间
        Date nowDate = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timeString2 = simpleDateFormat.format(nowDate);
        System.out.println(timeString2);
    }

}
