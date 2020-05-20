package cn.duhongbiao.day08.byteStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
*
* * `FileInputStream(File file)`： 通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件系统中的 File对象 file命名。
* * `FileInputStream(String name)`： 通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件系统中的路径名 name命名。
*  */
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
//        show01();
//        show02();
//        show03();
//        show04();
        show05();
    }

    private static void show05() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Java\\file\\a.txt");
        byte[] bytes = new byte[1024];
        int read = 0;
        while ((read = fis.read(bytes)) != -1){
            System.out.println(new String(bytes,0,read));//String(byte[] bytes, Charset charset)通过使用指定的 charset 解码指定的 byte 数组，构造一个新的 String。
        }
        fis.close();
    }

    private static void show04() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Java\\file\\a.txt");
        byte[] bytes = new byte[2];
        int read = fis.read(bytes);
        System.out.println(read);//读取的字节个数
        System.out.println(new String(bytes));
        read = fis.read(bytes);
        System.out.println(read);//读取的字节个数
        System.out.println(new String(bytes));
        read = fis.read(bytes);
        System.out.println(read);//读取的字节个数
        System.out.println(new String(bytes));
        read = fis.read(bytes);
        System.out.println(read);//读取的字节个数
        System.out.println(new String(bytes));
        fis.close();
//2
//AB
//2
//CD
//2
//EF
//1
//GF
    }

    private static void show03() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Java\\file\\a.txt");
        byte[] bytes = new byte[7];
        int read = fis.read(bytes);
        fis.close();
        System.out.println(read);//读取的字节个数
        for (int i = 0; i < bytes.length; i++) {
            System.out.print((char) bytes[i]+",");
        }
    }

    private static void show02() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Java\\file\\a.txt");
        int len = 0;
        while ( (len = fis.read()) != -1 ) {
            System.out.print((char) len);
        }//H
        fis.close();
    }

    private static void show01() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Java\\file\\a.txt");
        int read = fis.read();//每次只读一个字节
        System.out.println((char) read);//H
        fis.close();
    }
}
