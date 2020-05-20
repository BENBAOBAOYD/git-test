package cn.duhongbiao.Test;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchonizedPrint {
    public static int which = 0;
    static Lock lock = new ReentrantLock();
    static Condition condition = lock.newCondition();

    public static void main(String[] args) {
        Thread[] threads = new Thread[] {new MyThread(0,"早"),new MyThread(1,"中"),new MyThread(2,"晚"),};
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
    }
    private static class MyThread extends Thread {
        int index;
        String str;
        public MyThread(int index, String str) {
            this.index = index;
            this.str = str;
        }

        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                lock.lock();
                while (this.index != which){
                    try {
                        condition.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        condition.signalAll();
                    }
                }
                System.out.println(this.str+i);
                which = ++which % 3;
                condition.signalAll();
                lock.unlock();
            }
        }
    }
}

