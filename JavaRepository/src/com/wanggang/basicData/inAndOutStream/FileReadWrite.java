package com.wanggang.basicData.inAndOutStream;

import java.io.*;

/**
 * Created by 王刚 on 2017/12/7.
 * class description : 文件的读写,文件读写的乱码处理
 */
public class FileReadWrite {

    public static void main(String[] args) {
//        readFile();
//        writeFile();
//        writeFileWithEncode();
        readFileWithEncode();
    }

    /**
     * 读取文件中的内容
     */
    public static void readFileWithEncode() {
        File file = new File("test.txt");
        try {
            //获取文件流
            FileInputStream fileInputStream = new FileInputStream(file);
            //获取文件读取对象
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "utf-8");
            //创建一个可变字符串 进行数据的拼接
            StringBuffer stringBuffer = new StringBuffer();
            while (inputStreamReader.ready()) {
                stringBuffer.append((char) inputStreamReader.read());
            }
            System.out.println(stringBuffer.toString());

            //关闭流
            inputStreamReader.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 将内容写入指定的文件,无乱码
     */
    public static void writeFileWithEncode() {
        File file = new File("test.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "utf-8");
                outputStreamWriter.append("中文输入");
                //关闭时,会自动写入
                outputStreamWriter.close();
                //关闭FileOutputStream
                fileOutputStream.close();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 读取一个文件中的内容 会有乱码
     */
    public static void readFile() {
        //1.通过文件名字获取文件
        File file = new File("test.txt");
        //2.获取文件的二进制
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);

            //3.输出到控制台
            for (int i = 0; i < fileInputStream.available(); i++) {
                System.out.println((char) fileInputStream.read());
            }
        } catch (FileNotFoundException e) {
            java.lang.String message = e.getMessage();
            System.out.println(message);
        } catch (IOException e) {
            java.lang.String message = e.getMessage();
            System.out.println(message);
        }
    }

    /**
     * 向一个文件中写入内容 会覆盖原来的内容 会出现乱码
     */
    public static void writeFile() {
        String string = "123";
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("test.txt");
            for (int i = 0; i < string.length(); i++) {
                try {
                    outputStream.write(string.charAt(i));
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
