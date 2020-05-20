package cn.duhongbiao.day09.ObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
* `java.io.ObjectOutputStream ` 类，将Java对象的原始数据类型写出到文件,实现对象的持久存储。
* 是对象序列化必须实现Serializable接口，表示改类的对象可序列化
* Serializable也叫做标记型接口,一个接口里面什么内容都没有，我们可以将它理解成一个标识接口。
* 构造方法
* `public ObjectOutputStream(OutputStream out) `： 创建一个指定OutputStream的ObjectOutputStream。
* 特有的成员方法
* `public final void writeObject (Object obj)` : 将指定的对象写出。
* 使用步骤
* 1，创立一个ObjectOutputStream对象
* 2，使用writeObject方法写入
* 3，资源释放
* */
public class Demo01ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        new ObjectOutputStream(new FileOutputStream("D:\\Java\\file\\files"));

    }
}
