package cn.duhongiao.day04.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*遍历map集合第二种方法,使用Entry
* Map集合中的方法:
*    Set<Map.Entry<K,V>> entrySet() 返回此映射中包含的映射关系的 Set 视图
*  实现步骤:
*   1:使用Map集合中的方法entrySet
*   2:遍历Set集合获取每一个Entry对象
*   3:使用Entry对象中的方法getSet()和getValue()获取键与值*/
public class Demo03MapEntrySet {
    public static void main(String[] args) {
        Map<String,String> map1 = new HashMap<>();
        map1.put("1", "范冰冰1");
        map1.put("2", "范冰冰2");
        map1.put("3", "范冰冰3");
        //1:使用Map集合中的方法entrySet
        Set<Map.Entry<String, String>> entries = map1.entrySet();
        //2:遍历Set集合获取每一个Entry对象
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            //3:使用Entry对象中的方法getSet()和getValue()获取键与值
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }

    }
}
