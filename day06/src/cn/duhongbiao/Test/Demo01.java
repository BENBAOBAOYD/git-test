package cn.duhongbiao.Test;

public class Demo01 {
        /**
         * 控制哪个线程执行
         */
        private static int which = 0;
        public static void main(String[] args) {
            //分别创建三个线程
            MyThread[] threads = new MyThread[] { new MyThread("A", "早上",0),
                    new MyThread("B", "中午",1), new MyThread("C", "晚上",2) };
            for (int i = 0; i < threads.length; i++) {
                //启动线程
                threads[i].start();
//                System.out.println(threads[i].tName+threads[i].idx);
            }
        }

        private static class MyThread extends Thread {
            /**
             * 线程名字
             */
            private String tName;
            /**
             * 需要打印的内容
             */
            private String mPString;
            /**
             * 线程编号
             */
            private int idx;

            public MyThread(String name, String string, int idx) {
                this.tName = name;
                this.mPString = string;
                this.idx = idx;
            }


            public void setIndex(int i) {
                this.idx = i;
            }

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    synchronized (MyThread.class) {
                        while (this.idx != which) {//如果到了我的编号，跳出while执行打印
                            try {
                                //如果不到我的编号，我就继续睡觉
                                MyThread.class.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println(this.tName + ":" + this.mPString + ":"
                                + (i + 1)+"which"+which+"idx"+idx);
                        which = ++which % 3;//打印完毕，编号++
                        MyThread.class.notifyAll();//唤醒所有沉睡的线程
                    }
                }
            }
        }
    }

