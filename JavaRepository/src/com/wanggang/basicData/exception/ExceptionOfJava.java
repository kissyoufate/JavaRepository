package com.wanggang.basicData.exception;

/**
 * create by Gary Wong
 * 2017/12/11
 * class describetion : java中的异常类
 */
public class ExceptionOfJava {
    /*
    Throwable 总父类
    1) Error类
    2) Exception类
        2.1)IOException类
        2.2)RuntimeException类
    */

    /*
    * 多重catch 捕获不同异常
    * finally 一定会执行的
    *
    *
    * */

    public static void main(String[] args) {
        //捕获异常
        try {
            testException();
        } catch (BaseException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * 测试自定义的异常类
     * @throws BaseException 抛出异常
     */
    public static void testException() throws BaseException{
        try {
            int i = 1/0;
        } catch (Exception e) {
            throw new BaseException("除数不能为0");
        }
    }
}
