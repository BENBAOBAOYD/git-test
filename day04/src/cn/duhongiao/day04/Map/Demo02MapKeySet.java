package cn.duhongiao.day04.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*遍历Map集合
* Map集合的第一种遍历方式,
* Map集合中的方法:
*   Set<K> name = keySet();  返回此映射中包含键的set视图
* 通过键找值的方式,步骤:
* 1,使用keySet(),把map集合中的key取出来,存储到一个set集合中
* 2,遍历set集合,获取Map集合中的每一个key
* 3,通过Map集合中的方法get(key),
* ,
* */
public class Demo02MapKeySet {
    public static void main(String[] args) {
        Map<String,String> map1 = new HashMap<>();
        map1.put("1", "范冰冰1");
        map1.put("2", "范冰冰2");
        map1.put("3", "范冰冰3");
        //1.使用keySet(),把map集合中的key取出来,存储到一个set集合中
        Set<String> keySet = map1.keySet();
        //2.遍历set集合,获取Map集合中的每一个key
        for (String key : keySet) {
            //3.通过key找到value
            String value = map1.get(key);
            System.out.println(value);
        }
    }
}
