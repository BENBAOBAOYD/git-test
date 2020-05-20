package cn.duhongbiao.day01.Object;


public class DemoToString {
    public static void main(String[] args) {
        Person person = new Person("123",12);
        System.out.println(person.toString());
        System.out.println(person);
        //直接打印对象的名字，其实就是调用对象的toString方法
        //也就是打印对象在堆中的地址值
        //即Random没有重写toString，Scanner和ArrayList重写了
    }
}
