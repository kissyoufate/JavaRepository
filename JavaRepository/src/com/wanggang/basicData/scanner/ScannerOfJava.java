package com.wanggang.basicData.scanner;

import java.util.Scanner;

/**
 * create by Gary Wong
 * 2017/12/11
 * class describetion : java中的scanner输入类
 */
public class ScannerOfJava {
    /*
    next() 与 nextLine() 区别
    next():

    1、一定要读取到有效字符后才可以结束输入。
    2、对输入有效字符之前遇到的空白，next() 方法会自动将其去掉。
    3、只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。

    next() 不能得到带有空格的字符串。
    nextLine()：

    1、以Enter为结束符,也就是说 nextLine()方法返回的是输入回车之前的所有字符。
    2、可以获得空白。
    */

    public static void main(String[] args) {
        //1.创建输入类
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入内容");

        //2.判断是否有输入
        if (scanner.hasNext()){
            //3.获取输入的内容 (输入的一段话,不包括 空格)
            String scannerString = scanner.next();

            //4.打印出来
            System.out.println("输入的内容为 :" + scannerString);
        }

        if (scanner.hasNextLine()){

            //3.1 获取一行
            String scannerLineString = scanner.nextLine();

            //4.1打印一行
            System.out.println("输入的一行内容为 :" + scannerLineString);

        }
    }
}
