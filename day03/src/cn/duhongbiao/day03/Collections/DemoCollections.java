package cn.duhongbiao.day03.Collections;

import java.util.ArrayList;
import java.util.Collections;


public class DemoCollections {
    public static void main(String[] args) {
        ArrayList<String> collection = new ArrayList<>();
        //addAll方法
        Collections.addAll(collection,"a","c","b","d");
        //shuffle方法
        Collections.shuffle(collection);
        //sort升序
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,4,3,6,4,8,9,5,4,2);
        Collections.sort(list);
        System.out.println(list);
        //使用sort排序，必须重写compareTo方法
         /*public static <T extends Comparable<? super T>> void sort(List<T> list) {
            list.sort((Comparator)null);
           }
           */
        /*Comparable接口的排序规则
        this - 参数 是升序排列*/

        Person person1 = new Person("aaa",4);
        Person person2 = new Person("bbb",2);
        Person person3 = new Person("ccc",3);
        ArrayList<Person> list1 = new ArrayList<>();
        Collections.addAll(list1,person1,person2,person3);
        Collections.sort(list1);
    }
}
