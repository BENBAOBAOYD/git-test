package cn.duhongbiao.day07.lambda01;

/*
* 格式：
* （参数列表）-> {方法体}*/
public class Demo01Lambda {
    public static void main(String[] args) {
        /*使用lambda表达式，来实现多线程*/
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"新线程创建了");
        }).start();
        //优化省略
        new Thread(()-> System.out.println(Thread.currentThread().getName()+"新线程创建了")
        ).start();
    }
}
