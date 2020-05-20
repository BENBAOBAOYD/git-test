package cn.duhongiao.day04.Map;

import java.util.HashMap;
import java.util.Set;


/*
* 使用hashMap存储自定义类型的键值
* Map集合保证key是唯一的,所以必须重写hashCode和equals保证key唯一*/
public class Demo04HashMapSaveClass {
    public static void main(String[] args) {
//        show01();
        show02();
    }

    private static void show02() {
        /*使用Person作为key那么就必须重写hashCode和equals方法*/
        HashMap<Person, String> hashMap = new HashMap<>();
        hashMap.put(new Person("赵",1),"北");
        hashMap.put(new Person("钱",2),"上");
        hashMap.put(new Person("孙",3),"广");
        hashMap.put(new Person("赵",1),"深");
    }

    private static void show01() {
        HashMap<String, Person> hashMap = new HashMap<>();
        hashMap.put("北",new Person("赵",1));
        hashMap.put("上",new Person("钱",2));
        hashMap.put("广",new Person("孙",3));
        hashMap.put("北",new Person("李",4));
        //遍历Map集合
        Set<String> keySet = hashMap.keySet();
        for (String key : keySet) {
            Person person = hashMap.get(key);
            System.out.println(key+":"+person);
        }
    }
}
