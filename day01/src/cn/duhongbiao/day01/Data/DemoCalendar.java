package cn.duhongbiao.day01.Data;

import java.util.Calendar;

/*日历类
* java.util.Calendar
* Calendar是一个抽象类，里面提供了很多操作日历字段的方法
* 无法直接创建对象来使用。里面有一个静态方法叫getInstance*/
public class DemoCalendar {
    public static void main(String[] args) {
//        method1();
//        method2();
//        mothod3();
    }
    /*
    * public abstract void add(int field, int amount);
     */
    private static void mothod3() {
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.YEAR,1);
        int i = instance.get(Calendar.YEAR);
        System.out.println(i);

    }

    /*public void set(int field, int value)
    * 覆盖日历指定字段
    * public static final int YEAR = 1;
      public static final int MONTH = 2;
      public static final int WEEK_OF_YEAR = 3;
      public static final int WEEK_OF_MONTH = 4;
      public static final int DATE = 5;
      public static final int DAY_OF_MONTH = 5;*/
    private static void method2() {
        Calendar instance = Calendar.getInstance();
     /*   instance.set(Calendar.YEAR,1997);
        instance.set(Calendar.MONTH,8);
        instance.set(Calendar.DATE,12);*/
     instance.set(1997,8,12);
    }

    private static void method1() {
        //创建一个日历对象
        Calendar c = Calendar.getInstance();
        //返回日历中的指定字段
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH);//西方月份0-11，东方1-12
        System.out.println(month);
        int day = c.get(Calendar.DATE);
        System.out.println(day);
    }
}
