package cn.duhongbiao.day02.Generic;

public class DemoGenericInterface {
    public static void main(String[] args) {
        // 第一种方式
        GenericInterfaceImpl genericInterface = new GenericInterfaceImpl();
        genericInterface.method("123");
        //第二种方式
        GenericInterfaceImpl2<String> genericInterfaceImpl2 = new GenericInterfaceImpl2<String>();
        genericInterfaceImpl2.method("456");
    }
}
