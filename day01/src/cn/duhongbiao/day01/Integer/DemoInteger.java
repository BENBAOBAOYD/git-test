package cn.duhongbiao.day01.Integer;

import java.util.ArrayList;

public class DemoInteger {
    public static void main(String[] args) {
        //装箱
        //静态方法
        Integer integer = Integer.valueOf(1);
        Integer integer2 = Integer.valueOf('a');
        System.out.println(integer2);
        Integer integer3 = Integer.valueOf('1');
        //拆箱
        int i = integer3.intValue();
        //自动拆箱与自动装箱
        /*
        * java5之后的新特性*/
        Integer a = 1;
        /*自动拆箱*/
        a = a + 2 ;//a是包装类，无法直接参与运算，但是自动拆箱，就可以自动转换为基本数据类型

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);//自动装箱
        int integer1 = arrayList.get(0);//自动拆箱
    }
}
