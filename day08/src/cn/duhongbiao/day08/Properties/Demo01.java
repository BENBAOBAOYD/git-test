package cn.duhongbiao.day08.Properties;

import java.util.Properties;
import java.util.Set;

/*
* `java.util.Properties ` 继承于` Hashtable` ，来表示一个持久的属性集。
* 它使用键值结构存储数据，每个键及其对应值都是一个字符串。
* 该类也被许多Java类使用，比如获取系统属性时，`System.getProperties` 方法就是返回一个`Properties`对象。
*
* */
public class Demo01 {
    public static void main(String[] args) {
        show01();
        show02();
    }

    private static void show02() {

    }

    private static void show01() {
        /*使用Properties集合存储数据*/
        Properties properties = new Properties();
        properties.setProperty("1","10");
        properties.setProperty("2","20");
        properties.setProperty("3","30");
        // Set<String> stringPropertyNames()   返回此属性列表中的键集，其中该键及其对应值是字符串，如果在主属性列表中未找到同名的键，则还包括默认属性列表中不同的键。
        Set<String> set = properties.stringPropertyNames();
        //遍历set集合去除Properties集合的每一个键
        for (String key : set) {
            String value = properties.getProperty(key);
            System.out.println(key+":"+value);
        }
    }
}
