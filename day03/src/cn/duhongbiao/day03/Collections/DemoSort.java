package cn.duhongbiao.day03.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//使用sort排序，必须实现comparable接口重写compareTo方法
/*      Comparable接口的排序规则
        this-参数 是升序排列,反之则是降序
        注意,comparator和comparable的区别:
        1,comparable是自己和别人比
        2,comparator:相当于找一个第三方的裁判来比较两个人

        */
public class DemoSort {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,4,3,6,4,8,9,5,4,2);
        Collections.sort(list);
        System.out.println(list);
        //比较自定义类型
        Person person1 = new Person("aaa",4);
        Person person2 = new Person("bbb",2);
        Person person3 = new Person("ccc",4);
        ArrayList<Person> list1 = new ArrayList<>();
        Collections.addAll(list1,person1,person2,person3);
        Collections.sort(list1);
        //匿名实现Comparator重写compare比较的规则
        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2,1,4,3,6,4,8,9,5,4,2);
        Collections.sort(list2, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return t1 - integer;
            }
        });
        System.out.println(list2);
        //比较自定义类型的方式1
/*        Student student1 = new Student("a",6);
        Student student2 = new Student("b",3);
        Student student3 = new Student("c",1);
        ArrayList<Student> list3 = new ArrayList<>();
        Collections.addAll(list3,student1,student2,student3);
        Collections.sort(list3, new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return student.getAge() - t1.getAge();
            }
        });
        System.out.println(list3);*/
        //比较自定义类型的方式1
        //如果年龄相同则使用姓名的第一个字比较
        Student student1 = new Student("a",6);
        Student student2 = new Student("b",3);
        Student student3 = new Student("c",6);
        ArrayList<Student> list3 = new ArrayList<>();
        Collections.addAll(list3,student1,student2,student3);
        Collections.sort(list3, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge() - o2.getAge();
                if(result == 0){
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(list3);

    }
}
