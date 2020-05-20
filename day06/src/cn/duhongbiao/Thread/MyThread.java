package cn.duhongbiao.Thread;
/**/
//*   1，创建一个Thread类的子类
public class MyThread extends Thread{
//*   2，重写Thread类的run方法，设置线程任务

    public MyThread() {
        super();
    }

    public MyThread(String a, int i) {
    }

    @Override
    public void run() {
/*        for (int i = 0; i < 20; i++) {
            System.out.println("Thread"+i);
        }
        String name = super.getName();
        System.out.println(name);*/
        System.out.println(Thread.currentThread().getName());
    }
}
