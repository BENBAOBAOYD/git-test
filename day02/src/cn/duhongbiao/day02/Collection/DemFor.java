package cn.duhongbiao.day02.Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
* 增强for循环底层也是使用迭代器，使for循环的二哥是，简化了迭代器的书写
* 是java5的新特性
* 用来遍历集合和数组
* 格式:
*       for(集合/数组的数据类型 变量名:及革命/数组名){
*       sout（变量名）；
*       }*/
public class DemFor {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    private static void demo02() {
        Collection<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        for(String s:list) {
            System.out.println(s);
        }
    }

    private static void demo01() {
    int[] array = {1,2,3,4,5};
    for(int i:array){
        System.out.println(i);
    }
    }
}
