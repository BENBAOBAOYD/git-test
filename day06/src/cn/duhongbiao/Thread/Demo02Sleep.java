package cn.duhongbiao.Thread;

/*模拟秒表*/
public class Demo02Sleep {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
