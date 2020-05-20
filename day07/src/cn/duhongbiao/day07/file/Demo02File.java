package cn.duhongbiao.day07.file;

import java.io.File;
import java.io.IOException;

/*File方法，
* 1，一系列get方法
* 2，判断方法
* boolean exists()
          测试此抽象路径名表示的文件或目录是否存在。
* boolean isFile()
          测试此抽象路径名表示的文件是否是一个标准文件。
*  boolean isDirectory()
          测试此抽象路径名表示的文件是否是一个目录。
*
* 3,创建删除方法
* boolean mkdirs()
          创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。
* boolean mkdir()
          创建此抽象路径名指定的目录。
* boolean delete()
          删除此抽象路径名表示的文件或目录。
* boolean createNewFile()
          当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件
*
* */
public class Demo02File {
    public static void main(String[] args) {
//        show01();
//        show02();
        show03();
    }

    private static void show03() {
        File file1 = new File("D:\\Java\\file\\txt");
        file1.mkdir();//只能创建单级文件夹
        File file2 = new File("D:\\Java\\file\\b.txt");
        try {
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File file3 = new File("D:\\Java\\file\\c.txt");
        file3.delete();//不走回收站，删除需谨慎
        File file4 = new File("D:\\Java\\file\\flies\\a");
        file4.mkdirs();//创建多级文件夹，但是只能创建文件夹。不能创建文件
    }

    private static void show02() {
        //boolean exists()
        //          测试此抽象路径名表示的文件或目录是否存在。
        File file1 = new File("D:\\Java\\file\\a.txt");
        boolean exists = file1.exists();
        System.out.println(exists);//true
    }

    private static void show01() {
        File file1 = new File("D:\\Java\\file\\a.txt");
        File absoluteFile = file1.getAbsoluteFile();
        File file = new File("D:\\Java\\JavaNext\\day07\\src\\cn\\duhongbiao\\day07\\file\\Demo02File.java");
        //获取该文件的大小，以字节为单位
        long length = file1.length();
        System.out.println(length);
    }
}
