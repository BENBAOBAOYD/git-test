package cn.duhongbiao.day02.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Iterator接口（对集合进行遍历）
 * 有两个常用方法
 * boolean hasNext( )判断是否仍有元素
 * E next（） 返回迭代的下一个元素
 * 我们需要使用Iterator的实现类对象
 * Collection使用iterator（）方法来获取迭代器的实现类对象
 *
 * 迭代器的使用步骤
 * 1，使用集合中的iterator方法获取迭代器的实现类对象，使用Iterator接口来接受
 * 2，使用Iterator接口中的方法hasNext判断是否有下一个元素
 * 3.使用next（）方法来取出元素
 * */
public class DemoIterator {
     public static void main(String[] args) {
         Collection<String> collection = new ArrayList<>();
         collection.add("000");
         collection.add("001");
         collection.add("010");
         collection.add("011");
         //1,获取迭代器对象
         Iterator<String> iterator = collection.iterator();
         //2,使用hasNext
         boolean b = iterator.hasNext();
         //3,使用next
         String next = iterator.next();
         //不知道集合中有多少元素，采用while循环，优化上述步骤
         System.out.println("==================");
         while (iterator.hasNext()){
             String next1 = iterator.next();
             System.out.println(next1);
         }
     }
}
