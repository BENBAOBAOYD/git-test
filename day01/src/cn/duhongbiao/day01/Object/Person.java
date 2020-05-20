package cn.duhongbiao.day01.Object;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    //直接打印对象地址没有意义，所以需要重写
    //用来打印name和age

/*    @Override
    public String toString() {
        return "Person{name="+this.name+"Age="+this.age+"}";
    }*/

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



      /*
        Object类默认的equals方法
        public boolean equals(Object obj) {
        return this == obj;
        }
        boolean b = person1.equals(person2);
        System.out.println(b);//false默认比较的是地址值
        要重写equals方法比较两个对象的属性
      * 隐含问题：equals所使用参数为父类指向子类对象
      * 包含多态，无法使用子类特有内容，所以需要向下转型
      */

/*    @Override
    public boolean equals(Object obj) {
        //使用向下转型
        //增加判断，防止类型转换异常
        //判断是否比较本身
        if(obj == this){
            return true;
        }
        //判断是否为null
        if (obj == null){
            return false;
        }
        //是否为同类型
        if (obj instanceof Person) {
            Person person = (Person) obj;
            boolean b = this.name.equals(person.name) && this.age == person.age;
            return b;
        }
        //不是这个类型，直接返回false
        return false;

    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //反射getClass() != o.getClass()
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                //java7之后提供了Objects类提供了一些静态方法
                //防止空指针异常
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
