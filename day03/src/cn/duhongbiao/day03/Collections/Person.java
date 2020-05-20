package cn.duhongbiao.day03.Collections;

import java.util.Objects;
//注意Comparable<Person>的泛型
public class Person extends Object implements Comparable<Person>{

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    //重写hashCode和equals方法


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//比较地址值
        if (o == null || getClass() != o.getClass()) return false;//空或者不属于同一类则false
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    //覆盖重写compareTo方法
    // /*Comparable接口的排序规则
    //        this - 参数 是升序排列*/
    @Override
    public int compareTo(Person o) {
//        return 0;默认元素都是相同的
    //自定义笔记规则，比较两个人的年龄
        return this.getAge() - o.getAge();

    }


}
