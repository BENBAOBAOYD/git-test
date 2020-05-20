package cn.duhongbiao.day07.file;

import java.io.File;

/*便利路径方法
*  String[] list()
          返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件和目录。
* File[] listFiles()
          返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。
*注意，这两个方法遍历的是构造方法中给出的路径
* 如果构造方法中给出的路径不是一个目录则会抛出空指针异常
*
*
*
*
*
* */
public class Demo03File {
    public static void main(String[] args) {
        show01();
        show02();
    }

    private static void show02() {
        File file1 = new File("D:\\Java\\file");
        File[] files = file1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
        //D:\Java\file\a.txt
        //D:\Java\file\b.txt
        //D:\Java\file\flies
    }

    private static void show01() {
        File file1 = new File("D:\\Java\\file");
        String[] list = file1.list();
        for (String s : list) {
            System.out.println(s);
        }
        //a.txt
        //b.txt
        //flies
    }
}
