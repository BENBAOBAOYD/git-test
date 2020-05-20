package cn.duhongbiao.day02.Generic;

import java.util.ArrayList;

public class DemoGeneric {
    public static void main(String[] args) {
        show01();
    }
    /*
    * 不使用泛型，
    * 好处，集合不适用泛型默认类型就是Object类型，可以存储任意类型的数据
    * 弊端，不安全会引发异常
    * 使用泛型
    * 好处，
    * 1，避免了类型转换的麻烦，存储的是什么类型，去除的就是什么类型
    * 2，把运行期的异常，提升到了编译期
    * 弊端
    * 只能存储泛型的类型的数据*/
    private static void show01() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("123");
        arrayList.add("456");
        arrayList.add("789");
        for (String str:arrayList){
            System.out.println(str);
        }
    }
}
