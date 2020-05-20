package cn.duhongbiao.Thread;
/*
* 创建多线程程序的第一种方式，创建Thread类的子类
* 想要实现多线程程序，就必须继承Thread类
* 实现步骤:
*   1，创建一个Thread类的子类
*   2，重写Thread类的run方法，设置线程任务
*   3，创建Thread类的子类对象
*   4，调用Thread类中的start方法，开启新的线程，执行run方法
*   start()
          使该线程开始执行；Java 虚拟机调用该线程的 run 方法。
          结果是两个线程并发地运行；当前线程（从调用返回给 start 方法）和另一个线程（执行其 run 方法）。
          多次启动一个线程是非法的。特别是当线程已经结束执行后，不能再重新启动。
    java程序属于抢占式调度，哪个线程的优先级高哪个就先执行
*/
public class Demo01Thread {
    public static void main(String[] args) {
        //*   3，创建Thread类的子类对象
        MyThread myThread = new MyThread();
        //*   4，调用Thread类中的start方法，开启新的线程，执行run方法
        //获取线程名称
        /*线程名称
        *   主线程：main
        *   新线程Thread-0*/
        myThread.setName("1111");//设置线程名称的方式1
//        Thread thread2 = new MyThread("222");
        myThread.start();
//        thread2.start();
        System.out.println(Thread.currentThread().getName());
//        myThread.start();//IllegalThreadStateException

    }
}
