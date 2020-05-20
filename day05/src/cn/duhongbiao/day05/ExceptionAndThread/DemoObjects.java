package cn.duhongbiao.day05.ExceptionAndThread;


import java.util.Objects;
public class DemoObjects {
    public static void main(String[] args) {
        method(null);
    }
    public static void method(Object obj) {
        //对传递过来的参数进行合法性判断，判断是否为空
/*        if (obj == null) {
            throw new NullPointerException("传递的值为空");
        }*/
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj,"传递的值为空");
    }
}
