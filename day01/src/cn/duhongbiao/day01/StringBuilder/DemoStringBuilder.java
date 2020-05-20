package cn.duhongbiao.day01.StringBuilder;

public class DemoStringBuilder {
    public static void main(String[] args) {
        //两种构造方法
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder("123");
        //常用成员方法append
/*        StringBuilder stringBuilder = stringBuilder1.append("123");
        System.out.println(stringBuilder == stringBuilder1);//true*/
        stringBuilder1.append("123");
        stringBuilder1.append(123);
        stringBuilder1.append('a');
        stringBuilder1.append(true);
        System.out.println(stringBuilder1);
        /*链式编程：方法返回值是一个对象，可以继续调用方法*/
        stringBuilder2.append(12).append("12312").append("你哦");
        System.out.println(stringBuilder2);
        //常用成员方法toString
        String string = stringBuilder1.toString();
        System.out.println(string);
    }
}
