package cn.duhongbiao.day02.Generic;

import java.util.ArrayList;

public class DemoGenericClass {
    public static void main(String[] args) {
        //使用泛型创建对象
        GenericClass<Integer> aClass = new GenericClass();
        aClass.setName(123);
        ArrayList<String>  arrayList = new ArrayList<>();
        arrayList.add("123");
        method(arrayList);//测试使用泛型的方法
    }
    /*定义含有泛型的方法。泛型定义在方法的修饰符和返回值类型之间
    * 格式：
    *   修饰符 <泛型> 返回值类型 方法名 （参数列表（使用泛型））{
    *       方法体
    * }*/
    private static <E> void method(E e){
        System.out.println(e);
    }
}
