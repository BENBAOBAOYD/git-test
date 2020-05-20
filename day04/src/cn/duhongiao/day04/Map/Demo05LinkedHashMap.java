package cn.duhongiao.day04.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*public class LinkedHashMap<K,V>extends HashMap<K,V>implements Map<K,V>
* 可以预知迭代顺序
* 底层原理:
*       哈希表+链表(记录元素的顺序)*/
public class Demo05LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a","a");
        map.put("c","c");
        map.put("b","b");
        map.put("a","d");
        System.out.println(map);

        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("a","a");
        linkedHashMap.put("c","c");
        linkedHashMap.put("b","b");
        linkedHashMap.put("a","d");
        System.out.println(linkedHashMap);
    }
}
