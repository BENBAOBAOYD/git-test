package cn.duhongbiao.Synchronized;

/*实现买票案例
* 使用同步代码块来解决线程安全问题
* 格式：
*   synchronized（锁对象）{
*       可能会出现线程安全问题的代码（访问了共享数据的代码）
*   }
* */
/*注意：
* 1，通过代码块中的锁对象，可以使用任意的对象
* 2，但是必须保证多个线程使用的锁对象是同一个
* 3，锁对象的作用:
*   把同步代码块所著，只让一个线程在同步代码块中执行*/

import javafx.beans.binding.ObjectBinding;

public class RunnableImpl implements Runnable {
    /*定义一个多个线程共享的票源*/
    private int ticket = 100;

    //创建一个锁对象
    Object obj = new Object();//或者直接用this
    //设置线程任务：卖票
    @Override
    public void run() {
        while (true){
            sellTicket();
        }
        /*定义一个同步方法
        * */
    }
    public synchronized void sellTicket() {
        //判断票是否存在
        if (ticket > 0) {
            //提高安全问题出现的概率
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在卖第"
                    + ticket + "张票");
            ticket--;
        }
    }

}
