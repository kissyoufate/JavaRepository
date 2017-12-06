package com.wanggang.array;

/**
 * create by Gary Wong
 * 2017/12/6
 * class describetion : java中的数组
 */
public class ArrayOfJava {
    //声明一个数组 推荐
    public static int[] ints = {1,2,3,4};
    //或者
    public static int ints2[] = {1,23,4,5};

    public static void main(String[] args) {
        //使用new来创建 创建一个长度为2的int型数组
        int[] myints = new int[2];
        //给0号位置添加一个值
        myints[0] = 5;
        myints[1] = 3;

        //获取某一个位置的值
        System.out.println(myints[0]);

        //循环遍历数组
        for (int i=0;i<myints.length;i++){
            System.out.println(myints[i]);
        }

        //循环遍历数组2
        for(int i : myints){
            System.out.println(i);
        }

        //将数组作为参数传入方法
        arrParamMethod(myints);

        //将数组作为函数的返回值
        int[] returnArr = returnArr();
        System.out.println(returnArr.toString());
    }

    /**
     * 将数组作为参数传入方法
     */
    public static void arrParamMethod(int[] ints){
        for (int i : ints){
            System.out.println("----" + i);
        }
    }

    /**
     * 将数组作为方法的返回值
     * @return int数组
     */
    public static int[] returnArr(){
        int[] ints = {1,2,3};
        return ints;
    }
}
