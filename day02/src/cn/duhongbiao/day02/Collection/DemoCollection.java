package cn.duhongbiao.day02.Collection;

import java.util.ArrayList;
import java.util.Collection;

/*所有单列集合的顶层接口定义了所有单列集合共性的方法
*
* 共性的方法
* */
public class DemoCollection {
    public static void main(String[] args) {
        Collection<String> collection= new ArrayList<>();
        System.out.println(collection);//重写了toString
        // boolean add
        collection.add("111");
        collection.add("222");
        collection.add("333");
        collection.add("444");
        System.out.println(collection);//[111, 222, 333, 444]
        //boolean remove
        collection.remove("111");
        System.out.println(collection);//[222, 333, 444]
        //boolean contain
        boolean b1 = collection.contains("222");
        System.out.println(b1);//true
        boolean b2 = collection.contains("666");
        System.out.println(b2);//false
        //boolean isEmpty
        boolean b3 = collection.isEmpty();
        //int size
        int size = collection.size();
        System.out.println(size);
        //Object[] toArray
        Object[] objects = collection.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
        //void clear
        collection.clear();
        boolean b4 = collection.isEmpty();
        System.out.println(b4);
    }
}
