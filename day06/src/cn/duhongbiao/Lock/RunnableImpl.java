package cn.duhongbiao.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//实现买票案例
/*
* 解决线程问题的第三种方式，使用Lock锁
* java.util.concurrent.locks.lock接口
* Lock 实现提供了比使用 synchronized 方法和语句可获得的更广泛的锁定操作。
* lock接口的使用方法：
*   void lock（）获取锁
*   void unlock（）释放锁
* 使用步骤：
* 1，在成员位置创建一个ReentrantLock
* 2，在可能会出现线程安全问题的代码前用Lock接口中的方法lock获取锁
* 3，在可能会出现线程安全问题的代码前用Lock接口中的方法unlock释放锁*/
public class RunnableImpl implements Runnable {
    /*定义一个多个线程共享的票源*/
    private int ticket = 100;
    //1，在成员位置创建一个ReentrantLock
    Lock lock = new ReentrantLock();
    //创建一个锁对象
    Object obj = new Object();//或者直接用this
    //设置线程任务：卖票
    @Override
    public void run() {
        while (true) {
            //2，在可能会出现线程安全问题的代码前用Lock接口中的方法lock获取锁
            lock.lock();
            if (ticket > 0) {
                //提高安全问题出现的概率
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName() + "正在卖第"
                            + ticket + "张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    //3，在可能会出现线程安全问题的代码前用Lock接口中的方法unlock释放锁
                    lock.unlock();
                }
            }
        }
    }
}
