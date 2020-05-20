package cn.duhongbiao.day09.ReverseStream;

import java.io.*;

public class Demo01Copy {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\Java\\file\\a.txt"),"GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\Java\\file\\files\\a.txt"),"UTF-8");
        char[] chars = new char[1024*8];
        int len = 0;
        while ((len = isr.read(chars)) != -1) {
            osw.write(chars,0, len);
        }
        isr.close();
        osw.close();
    }
}
