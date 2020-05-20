package cn.duhongbiao.day03.Set;

import javafx.beans.binding.ObjectBinding;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/*
* 特点
* 1，不能存储重复的元素
* 2，没有索引，不能用普通for循环
* 不是同步的是多线程的
* HashSet
* 1，不能存储重复的元素，允许空值
* 原理：（重地和通话hashcode一样，使用add方法的时候会调用hashcode和equals来判断哈希值是否重复，哈希值相同则哈希冲突）
* 2，没有索引，不能用普通for循环
* 3，是一个无序的集合，存储和取出的元素顺序有可能不一致
* 4，底层是要给哈希表结构,查询的速度非常快
* 5，不是线程安全的*/
public class DemoSet {
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();
        //使用add方法
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(2);
        hashSet.add(4);
        hashSet.add(1);
        System.out.println(hashSet);
        //使用迭代器遍历
        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }
    }
}
