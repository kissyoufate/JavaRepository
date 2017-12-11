package com.wanggang.basicData.stringstring;

/**
 * create by Gary Wong
 * 2017/12/6
 * class describetion : java中的String对象相关
 */
public class StringOfJava {
    public static final String MYSTRING = "这是一个静态的不可被继承和重写的字符串";

    public static void main(String[] args) {
        //使用字符数组生成一个字符串
        char[] chars = {'a','b','c'};
        String string = new String(chars);
        System.out.println(string);

        //获取字符串长度
        int lenth = string.length();
        System.out.println(lenth);

        //连接字符串
        String str = "前一段";
        String str2 = "后一段";
        System.out.println(str.concat(str2));
        System.out.println(str + str2);

        //比较字符串
        System.out.println(str.equals(str2));

        //过滤字符串 忽略前后的空格
        System.out.println(str.trim());
    }
}
