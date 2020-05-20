package cn.duhongbiao.day09.BufferedStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01Output {
    public static void main(String[] args) {
        try ( FileOutputStream fos = new FileOutputStream("D:\\Java\\file\\a.txt",true);
              BufferedOutputStream bos = new BufferedOutputStream(fos);)
        {
            String str = "ABCDEfghijklmnopqrstuvwxyz\n";
            byte[] bytes = str.getBytes();
            for (int i = 0; i < 1000000; i++) {
                bos.write(bytes,0,bytes.length);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
