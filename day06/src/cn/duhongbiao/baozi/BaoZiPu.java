package cn.duhongbiao.baozi;

/*生产者
* 注意：
* 包子铺线程必须和包子线程通信
* 必须用同步技术来保证只有一个在执行
* 锁对象必须保证唯一，可以使用包子对象作为锁对象
* 包子铺类和吃货类就需要把包子对象作为参数传递进来
*       */
public class BaoZiPu extends Thread {
    private BaoZi baoZi;
    public BaoZiPu(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        //
        int count = 0;
        while (true) {
            synchronized (baoZi) {
                if (baoZi.flag == true) {
                    try {
//                        System.out.println("baozipu wait");
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒之后执行
                if (count == 0) {
                    baoZi.pi = "薄皮";
                    baoZi.xian = "三鲜";
                } else {
                    baoZi.pi = "冰皮";
                    baoZi.xian = "牛肉";
                }
                count = ++count % 2;
                System.out.println("包子铺正在生产包子" + baoZi.pi + baoZi.xian + "包子");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                baoZi.flag = true;
                //唤醒顾客线程
                baoZi.notify();
                System.out.println("包子铺生产好了" + baoZi.pi + baoZi.xian + "包子，可以吃了");
            }
        }
    }
}
