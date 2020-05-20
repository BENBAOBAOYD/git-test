package cn.duhongbiao.day03.List;

public class DemoExtend {
    public static void main(String[] args) {
        Fu a = new Zi();
        a.print();//多态，方法重名，使用子类方法
//        a.methodZi;//错误，无法使用子类特有方法
        a.methodFu();//可以使用父类方法
        System.out.println(a.x);//使用父类成员变量



        Zi zi = new Zi();
        zi.methodZi();//可以使用子类多余方法
        zi.methodFu();//可以使用父类独有方法
        System.out.println(zi.x);//使用子类成员变量
    }
}
