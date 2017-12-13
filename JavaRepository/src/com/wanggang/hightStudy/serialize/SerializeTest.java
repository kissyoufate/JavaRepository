package com.wanggang.hightStudy.serialize;

import org.junit.Test;

import java.io.*;

/**
 * create by Gary Wong
 * 2017/12/13
 * class describetion : 序列化测试
 */
public class SerializeTest {

    public static void main(String[] args) {
        //创建对象
        SerializeOfJava serializeOfJava = new SerializeOfJava();

        try {
            //创建一个新的文件流
            FileOutputStream fileOutputStream = new FileOutputStream("./serialize.ser");
            try {
                //获取文件流
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                //将对象写入
                objectOutputStream.writeObject(serializeOfJava);
                //关闭相关资源
                objectOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    /**
     * 读取序列化文件 (反序列化)
     */
    @Test
    public void readSerializeFile(){
        SerializeOfJava serializeOfJava = null;

        try {
            FileInputStream fileInputStream = new FileInputStream("serialize.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            serializeOfJava = (SerializeOfJava) objectInputStream.readObject();

            System.out.println(serializeOfJava);

            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
