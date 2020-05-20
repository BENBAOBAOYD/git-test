package cn.duhongbiao.SynchronizedStaticMethod;

/*模拟卖票案例
* 设置三个线程，同时卖票对共享的票进行出售*/
public class DemoTicket {
    public static void main(String[] args) {
        //创建runnable接口的实现类对象
        RunnableImpl run = new RunnableImpl();
        //创建Thread对象，传递Runnable实现类对象
        Thread Thread0 = new Thread(run);
        Thread Thread1 = new Thread(run);
        Thread Thread2 = new Thread(run);
        //调用start方法
        Thread0.start();
        Thread1.start();
        Thread2.start();

    }
}
