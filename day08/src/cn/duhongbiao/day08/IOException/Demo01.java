package cn.duhongbiao.day08.IOException;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) {
        //读取
        try (FileInputStream fis = new FileInputStream("D:\\Java\\file\\a.txt");
             FileOutputStream fos = new FileOutputStream("D:\\Java\\file\\flies\\a.txt");) {
            //可能会出现异常的代码
            int len = 0;
            byte[] bytes = new byte[1024];
            while ((len = fis.read(bytes)) != -1) {
                //写入
                fos.write(bytes, 0, len);
            }
            fos.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}