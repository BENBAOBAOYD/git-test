package cn.duhongbiao.day03.List;

import java.util.LinkedList;

/*
* LinkList特点
* 1,底层是一个双向链表
* 2,里面包含了大量操作首尾的方法*/
public class DemoLinkList {
    public static void main(String[] args) {
        demo01();
    }

    private static void demo01() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("000");
        linkedList.add("111");
        linkedList.add("222");
        System.out.println(linkedList);
        linkedList.addFirst("WWW");
        System.out.println(linkedList);
        linkedList.push("WWW");//等同于addFist
        System.out.println(linkedList);
//        linkedList.addLast();等同于add
        String first = linkedList.getFirst();
        String last = linkedList.getLast();
        System.out.println(first+","+last);
    }
}
