package cn.duhongbiao.day01.Object;

import java.sql.SQLOutput;

public class DemoEquals {
    /*
    * Person也可以使用equals方法*/
    public static void main(String[] args) {
        Person person1 = new Person("111",11);
        Person person2 = new Person("111",11);
        /*
        Object类默认的equals方法
        public boolean equals(Object obj) {
        return this == obj;
        }
        */
//        boolean b = person1.equals(person2);
//        System.out.println(b);//false默认比较的是地址值
        /*要重写equals方法比较两个对象的属性
        * 隐含问题：equals所使用参数为父类指向子类对象
        * 包含多态，无法使用子类特有内容，所以需要向下转型*/
        boolean b = person1.equals(person2);
        System.out.println(b);

    }
}
