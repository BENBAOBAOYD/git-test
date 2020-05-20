package cn.duhongbiao.day03.List;


import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) {
       /* Fu a = new Zi();
        a.print();//多态，方法重名，使用子类方法
        a.methodZi;//错误，无法使用子类特有方法*/
        ArrayList<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("333");
        System.out.println(list);//重写了toString
        String remove = list.remove(0);
        System.out.println(list);
        list.set(0,"aaa");
        System.out.println(list);
        //增强for循环
        for (String string : list) {
            System.out.println(string);
        }
    }
}
