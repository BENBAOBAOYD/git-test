package cn.duhongbiao.Test;

public class Demo01test {
    private static int which = 0;

    public static void main(String[] args) {
        MyThread[] myThreads = new MyThread[]{new MyThread("1", "早"), new MyThread("2", "中")
                , new MyThread("3", "晚")};
        for (int i = 0; i < myThreads.length; i++) {
            myThreads[i].setIdx(i);
            myThreads[i].start();
//            System.out.println(myThreads[i].idx);
        }
    }

    private static class MyThread extends Thread {
        private String name;
        private String print;
        private int idx;

        public MyThread(String name, String print) {
            super(name);
            this.name = name;
            this.print = print;

        }

        public void setIdx(int idx) {
            this.idx = idx;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                synchronized (MyThread.class) {
                    while (this.idx != which) {
                        try {
                            MyThread.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("线程名字" + this.name + this.print);
                    which = ++which % 3;
                    MyThread.class.notifyAll();
                }
            }
        }
    }
}
