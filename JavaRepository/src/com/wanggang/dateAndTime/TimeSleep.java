package com.wanggang.dateAndTime;

import java.util.Date;

/**
 * Created by 王刚 on 2017/12/7.
 * class description : 线程休眠
 */
public class TimeSleep {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(new Date().getTime());
        //让线程休眠3秒
        Thread.sleep(3 * 1000);
        System.out.println(new Date().getTime());
    }
}
