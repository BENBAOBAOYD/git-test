package cn.duhongbiao.threadpool;

/*线程池
* java5之后提供的java.util.concurrent.Executors
* newFixedThreadPool(int nThreads)
          创建一个可重用固定线程数的线程池，以共享的无界队列方式来运行这些线程
          * 参数：
          * int nThreads 需要创建的线程数量
          * 返回值：static ExecutorService
          * ExecutorService接口，返回ExecutorService接口接口的实现类对象
          * submit(Runnable task)
          提交一个 Runnable 任务用于执行，并返回一个表示该任务的 Future，
          * shutdown()
          启动一次顺序关闭，执行以前提交的任务，但不接受新任务。 */

/*线程池使用步骤：
* 1，使用线程池的工厂类Executors的静态方法，生产一个指定线程数量的线程池
* 2，创建一个类实现Runnable接口重写run方法，设置线程任务
* 3，调用ExecutorService中的方法submit，传递线程任务
* 4，调用shutdown销毁线程池，不建议执行*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        //1，使用线程池的工厂类Executors的静态方法，生产一个指定线程数量的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //3，调用ExecutorService中的方法submit，传递线程任务
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
    }
}
