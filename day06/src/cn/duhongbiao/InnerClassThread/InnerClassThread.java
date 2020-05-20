package cn.duhongbiao.InnerClassThread;

/*匿名内部类来实现线程的创建*/
public class InnerClassThread {
    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }
        new Thread("Thread匿名内部类实现的线程") {
            @Override
            public void run() {
                for (int i = 0; i < 1; i++) {
                    System.out.println(Thread.currentThread().getName()+i);
                }
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable run");
            } }) {
            @Override
            public void run() {
                super.run();//注意父类run方法，如果有Runnable参数传进来则先运行Runnable中重写的run方法
                System.out.println("Thread run");
            } }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable run2");
            }
        }) {
            @Override
            public void run() {
                super.run();
                System.out.println("Thread run2");
            }
        }.start();
    }
}
