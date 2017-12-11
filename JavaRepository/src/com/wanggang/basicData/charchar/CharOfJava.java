package com.wanggang.basicData.charchar;

/**
 * create by Gary Wong
 * 2017/12/6
 * class describetion : 字符 Char
 */
public class CharOfJava {
    public static void main(String[] args) {
        //c为一个字符  值为 c
        char c = 'c';

        System.out.println(c);

        //字符数组
        char[] chars = {'a','b','c'};
        System.out.println(chars);

        //new 一个字符对象
        Character character = new Character('h');
        System.out.println(character);

        //相关方法 均为静态方法
        Character myCharacter = 'w';

        //是否是一个字母 isLetter
        System.out.println(Character.isLetter(myCharacter));

        //是否是一个空格
        System.out.println(Character.isWhitespace(myCharacter));

        //大小写转换
        System.out.println(Character.toUpperCase(myCharacter));

        System.out.println(Character.toLowerCase(myCharacter));

        //将字符转换为字符串 长度为1
        String s = Character.toString(myCharacter);
        System.out.println(s);
        System.out.println(s.length());
    }
}
