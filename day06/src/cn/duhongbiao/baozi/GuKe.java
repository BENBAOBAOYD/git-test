package cn.duhongbiao.baozi;

public class GuKe extends Thread{
    private BaoZi baoZi;
    public GuKe(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (baoZi) {
                while (true) {
                    if (baoZi.flag == false) {
                        try {
                            baoZi.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    //被唤醒之后
                    System.out.println("吃货正在吃："+ baoZi.pi+baoZi.xian+"的包子");
                    //吃货吃完包子，修改包子的状态
                    baoZi.flag = false;
                    baoZi.notify();
                    System.out.println("吃货吃完了："+"请继续生产包子");
                    System.out.println("========================");
                }
            }
        }
    }
}
