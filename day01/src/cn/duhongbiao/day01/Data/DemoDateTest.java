package cn.duhongbiao.day01.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*计算一个人从出生到现在过了多少天
* 分析
* 1，使用Scanner过去输出日期
* 2，使用sdf的parse解析为Data类
* 3，把data类的日期转化为毫秒值
* 4，获取当前日期，转化为毫秒值
* 5，使用毫秒值的差值，
* 6，计算多少天（S/1000/60/60/24）*/
public class DemoDateTest {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入出生日期（XXXX年XX月XX日）");
        Scanner sc = new Scanner(System.in);
        String dataString = sc.next();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        Date parseData = simpleDateFormat.parse(dataString);
        long time = parseData.getTime();
        Date dateToday = new Date();
        long timeToday = dateToday.getTime();
        long gap = timeToday - time;
        System.out.println(gap/1000/60/60/24);
    }
}
