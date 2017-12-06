package com.wanggang.stringBuffer;

/**
 * create by Gary Wong
 * 2017/12/6
 * class describetion : 字符串改变的相关类
 */
public class VarString {

    public static void main(String[] args) {
        String myString = "这是一个字符串";
        StringBuffer stringBuffer = new StringBuffer(myString);

        //1.字符串追加
        stringBuffer.append("拼接拼接");
        System.out.println(stringBuffer);

        //获取指定位置的字符
        char c = stringBuffer.charAt(1);
        System.out.println(c);
    }
}
