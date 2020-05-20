package cn.duhongiao.day04.Map;

/*
接口 Map<K,V>
类型参数：
K - 此映射所维护的键的类型
V - 映射值的类型
*/

/*implement Map<k,v>
HashMap集合:
* 1,底层是哈希表
*   java8之前是数组+单向链表
*   java8之后是数组+单向链表/红黑树(链表的长度超过8):提高查询速度*/

import java.util.HashMap;
import java.util.Map;

/*extend HashMap<k,v>
LinkedHashMap
1,集合底层是哈希表+链表
2,是一个有序的集合,存储元素和取出元素是一致的*/
public class Demo01Map {
    public static void main(String[] args) {
//        show01();//put方法
//        show02();//remove方法
//        show03();//get方法
        show04();
    }

    private static void show04() {
        Map<String,String> map1 = new HashMap<>();
        map1.put("1", "范冰冰");
        map1.put("2", "范冰冰2");
        map1.put("3", "范冰冰3");
        boolean b = map1.containsKey("1");
        boolean b1 = map1.containsValue("1");
        System.out.println(b);
        System.out.println(b1);
    }

    private static void show03() {
        Map<String,String> map1 = new HashMap<>();
        map1.put("1", "范冰冰");
        map1.put("2", "范冰冰2");
        map1.put("3", "范冰冰3");

        System.out.println(map1);//{1=范冰冰, 2=范冰冰2, 3=范冰冰3}
        String get = map1.get("1");
        System.out.println(get);//范冰冰
        System.out.println(map1);//{1=范冰冰, 2=范冰冰2, 3=范冰冰3}
    }

    private static void show02() {
        Map<String,String> map1 = new HashMap<>();
        map1.put("1", "范冰冰");
        map1.put("2", "范冰冰2");
        map1.put("3", "范冰冰3");

        System.out.println(map1);//{1=范冰冰, 2=范冰冰2, 3=范冰冰3}
        String remove = map1.remove("1");
        System.out.println(remove);//范冰冰
        System.out.println(map1);//{2=范冰冰2, 3=范冰冰3}
    }

    private static void show01() {
        Map<String,String> map1 = new HashMap<>();
        String s = map1.put("1", "范冰冰1");
        System.out.println(s);//返回值为空
        String s1 = map1.put("1", "范冰冰2");
        System.out.println(s1);//返回值为范冰冰1,返回的是被替换的值
        System.out.println(map1);//{1=范冰冰2},重写了toString 方法


    }
}
