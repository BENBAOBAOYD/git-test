package cn.duhongbiao.day01.Object;

import java.util.Objects;

public class DemoObjects {
    public static void main(String[] args) {
        String a1 = null;
        String b1 = "123";
//        Boolean b = a1.equals(b1);//空指针异常
        boolean b = Objects.equals(a1, b1);
        System.out.println(b);
    }
}
