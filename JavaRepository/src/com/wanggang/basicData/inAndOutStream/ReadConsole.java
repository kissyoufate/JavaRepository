package com.wanggang.basicData.inAndOutStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by 王刚 on 2017/12/7.
 * class description : 读取控制台的输入内容  BufferedReader
 */
public class ReadConsole {
    public static void main(String[] args){
//        getCharOrStringOnConsole();
        writeStringOnConsole();
    }

    /**
     * 像控制台写出一个字符
     */
    public static void writeStringOnConsole(){
        int b;
        b = 'A';
        System.out.write(b);
        System.out.write('\n');
    }

    /**
     * 获取输入的一个字符 || 字符串
     */
    public static void getCharOrStringOnConsole() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("输入'q'退出!");
            //获取输入的一个字符
            char c = (char) bufferedReader.read();
            //获取输入的一行字符串
//            String str = (String)bufferedReader.readLine();
            if (c == 'q'){
                break;
            }else {
                System.out.println("不是输入的q");
            }
        }while ((char)bufferedReader.read() != 'q');
    }
}
