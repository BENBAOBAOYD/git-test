package cn.duhongbiao.day03.Set;

import cn.duhongbiao.day03.Collections.Person;

import java.util.HashSet;

/*HashSet存储自定义类型的元素
所以必须重写equals和hashCode发给发
要求：
    同年龄和同姓名的人视为同一个人
* */
public class DemoHashSetPerson {
    public static void main(String[] args) {
        //创建HashSet集合存储Person
        HashSet<Person> hashSet = new HashSet<>();
        Person person1 = new Person("111",111);
        Person person2 = new Person("222",222);
        Person person3 = new Person("111",111);
        hashSet.add(person1);
        hashSet.add(person2);
        hashSet.add(person3);
        System.out.println(hashSet);
    }
}
