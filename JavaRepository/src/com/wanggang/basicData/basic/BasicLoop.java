package com.wanggang.basicData.basic;

/**
 * create by Gary Wong
 * 2017/12/6
 * class describetion : 基本的循环条件语句 for while
 */
public class BasicLoop {
    public static void main(String[] args) {
        //1.for
        //2.while
        //3.do...while
        //4.while...do
        //5.for(生命语句 : 表达式)
        //6.break (跳出循环)
        //7.continue (结束本次循环,开始下一个)

        for (int i=0;i<10;i++){
            System.out.println("这是一个for循环,当前第"+i+"次");
        }

        int count = 10;
        while (count == 10){
            System.out.println("当前count==10");
            count = count - 1;
        }

        do {
            count = count - 1;
        }while (count < 10);

        int[] numbers = {1,2,3,4,5};
        for (int theInt : numbers){
            System.out.println(theInt);
        }

        for (int i=0;i<99;i++){
            if (i == 3){
                break;
            }
        }
    }
}
