package cn.duhongbiao.day01.Data;

import java.util.Date;

public class DemoDate {
    public static void main(String[] args) {
        //1000毫秒=1秒
        /*中国属于东八区，会把时间增加8小时
        * 1970年1月1日 00：00：00 是英国格林威治时间*/
        System.out.println(System.currentTimeMillis());//返回从1970年1月1日到现在一共多少毫秒
        demo01();
        demo02();
        demo03();
    }

    private static void demo03() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }

    //  传递毫秒值
    private static void demo02() {
        Date date = new Date(123456L);
        System.out.println(date);
    }

    /*
    * Data类的空参数构造，用来获取系统的日期和时间内*/
    private static void demo01() {
        Date date = new Date();
        System.out.println(date);
    }
}
