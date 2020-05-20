package cn.duhongbiao.day02.Generic;

import java.util.ArrayList;

/*泛型的通配符
* ？：代表任意的数据类型
* 使用方式
*   不能创建对象使用，
*   只能作为方法的参数使用*/
public class Demo02Generic{
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList2.add("A");
        arrayList2.add("B");
        arrayList2.add("C");
        /*定义一个方法，能遍历所有类型的ArrayList集合
        * 这时候我们不知道要用什么数据类型，可以用泛型的通配符案例接受数据*/
        printArrayList(arrayList1);
        System.out.println("=============");
        printArrayList(arrayList2);
    }
    public static void printArrayList(ArrayList<?> list) {
        System.out.println(list);
    }

}
