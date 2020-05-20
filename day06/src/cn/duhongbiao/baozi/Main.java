package cn.duhongbiao.baozi;

public class Main {
    public static void main(String[] args) {
        //创建包子对象
        BaoZi baoZi = new BaoZi();
        System.out.println(baoZi.flag);
        //创建包子铺对象
        new BaoZiPu(baoZi).start();
        //创建顾客线程
        new GuKe(baoZi).start();
    }
}
