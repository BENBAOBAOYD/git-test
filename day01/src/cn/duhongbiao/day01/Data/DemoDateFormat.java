package cn.duhongbiao.day01.Data;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*作用：
* 格式化:日期>文本   文本>日期
* 成员方法:
* String format(Data data)
* Data parse(String source)
* 子类为：
* java.text.SimpleDateFormat
* 构造方法：
* SimpleDataFormat（String pattern）
* 用给定的模式和默认语言环境的日期格式符号构造
* 模式
* 年 y
* 月 M
* 日 d
* 时 H
* 分 m
* 秒 s
* 例如： “yyyy-MM-dd HH-mm-ss”*/
public class DemoDateFormat {
    public static void main(String[] args) throws ParseException {
        method02();
    }
    /*把日期格式化为文本
     *1.创建sdf对象，使用指定模式
     *2.调用sdf成员方法format*/
    private static void method01() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = new Date();
        String dataFormat = sdf.format(date);
        System.out.println(dataFormat);
    }
    /*把文本转化为日期
    * 1，创建sdf对象，并传入需要转化的日期的格式
    * 2，调用parse方法解析为data日期
    * 注意
    * parse方法声明了一个异常，
    * 如果解析的字符串和构造方法不一样，那么就必须处理这个异常
    * 要吗throws这个异常，要么try catch自己处理
    * public Date parse(String source) throws ParseException {
    ParsePosition pos = new ParsePosition(0);
    Date result = this.parse(source, pos);
    if (pos.index == 0) {
        throw new ParseException("Unparseable date: \"" + source + "\"", pos.errorIndex);
    } else {
        return result;
    }
}
    *抛出异常 */
    private static void method02() throws ParseException {
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        Date parse = sdf2.parse("1997年08月12日");
        System.out.println(parse);
    }
}
