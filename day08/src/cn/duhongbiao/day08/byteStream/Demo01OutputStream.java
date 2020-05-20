package cn.duhongbiao.day08.byteStream;

/*
* `java.io.OutputStream `抽象类是表示字节输出流的所有类的超类，将指定的字节信息写出到目的地。它定义了字节输出流的基本共性功能方法。

* `public void close()` ：关闭此输出流并释放与此流相关联的任何系统资源。
* `public void flush() ` ：刷新此输出流并强制任何缓冲的输出字节被写出。
* `public void write(byte[] b)`：将 b.length字节从指定的字节数组写入此输出流。
* `public void write(byte[] b, int off, int len)` ：从指定的字节数组写入 len字节，从偏移量 off开始输出到此输出流。
* `public abstract void write(int b)` ：将指定的字节输出流。

> 小贴士：
>
> close方法，当完成流的操作时，必须调用此方法，释放系统资源。*/
/*

* `public FileOutputStream(File file)`：创建文件输出流以写入由指定的 File对象表示的文件。
* `public FileOutputStream(String name)`： 创建文件输出流以指定的名称写入文件。
- `public FileOutputStream(File file, boolean append)`： 创建文件输出流以写入由指定的 File对象表示的文件。
- `public FileOutputStream(String name, boolean append)`： 创建文件输出流以指定的名称写入文件。
当你创建一个流对象时，必须传入一个文件路径。该路径下，如果没有这个文件，会创建该文件。如果有这个文件，会清空这个文件的数据。

写入数据的原理
java程序->jvm->os->os调用写数据的方法->把数据写入到文件中*/

import java.io.FileOutputStream;
import java.io.IOException;

/*
* 文件字节输出流的使用步骤
* 1，创建一个FileOutputStream对象，构造方法中传递写入数据的目的地
* 2，调用write方法把数据写入到目的文件中
* 3，释放资源（流使用会占用一定的资源）*/
public class Demo01OutputStream {
    public static void main(String[] args) throws IOException {
//        show01();
        //在文件中写100需要些几个字节49 48 48
        //一次写多个字节，那么显示的时候会查询ASCII，如果第一个字节是负数，那么第一字节和第二个字节，会组成一个中文显示，查询系统默认码表GBK
//        show02();
//        show03();
//        show04();
        show05();
    }

    private static void show05() throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\Java\\file\\a.txt",true);
        for (int i = 0; i < 10; i++) {
            byte[] bytes = "Hello World 你好".getBytes();
            fos.write(bytes);//从索引1开始写入两个
            fos.write("\n".getBytes());//换行
        }
        fos.close();
    }

    private static void show04() throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\Java\\file\\a.txt");
        byte[] bytes = "Hello World 你好".getBytes();
        fos.write(bytes,0,bytes.length);//从索引1开始写入两个
        fos.close();
    }

    private static void show03() throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\Java\\file\\a.txt");
        byte[] bytes = {65,66,67,68,69};
        fos.write(bytes,1,2);//从索引1开始写入两个
        fos.close();
    }

    private static void show02() throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\Java\\file\\a.txt");
        byte[] bytes = {-65,-66,-67,68,69};
        fos.write(bytes);
        fos.close();
    }

    private static void show01() throws IOException {
        //* 1，创建一个FileOutputStream对象，构造方法中传递写入数据的目的地
        FileOutputStream fos = new FileOutputStream("D:\\Java\\file\\a.txt");
        fos.write(97);//a
        fos.close();
    }
}
