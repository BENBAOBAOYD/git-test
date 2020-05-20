package cn.duhongbiao.day09.BufferedStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo02BufferCopy {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\Java\\file\\a.txt"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\Java\\file\\flies\\a.txt"));) {
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = bis.read(bytes)) != -1 ) {
                bos.write(bytes,0,len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("程序执行时间："+(end-start));
    }
}
