package cn.duhongbiao.day01.Integer;

/*
* 基本类型与字符串之间的转换
* 1，几倍呢类型的值+""最简单的 方法（常用）
* 2，包装类的静态方法，toString(参数)，不是Object类的重载
* 3，String的静态方法valueOf
* 字符串》基本类型
* 使用包装类的静态方法 parseXXX（"字符串"）*/
public class Demo2Integer {
    public static void main(String[] args) {
        //ji>str
        int a = 123;
        String str1 = a + "";
        System.out.println(str1+111);
        String str2 = Integer.toString(a);
        String str3 = String.valueOf(a);
        //str>ji
        int i = Integer.parseInt(str1);
        int j = Integer.parseInt("123");
        System.out.println(i);
    }
}
