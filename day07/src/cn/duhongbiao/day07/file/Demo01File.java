package cn.duhongbiao.day07.file;

/*java.io.File类是文件和目录路径名的抽象表示，主要用于文件和目录的创建，查找和删除等操作
*
* static char pathSeparatorChar
          与系统有关的路径分隔符。windows 是分号，linux是冒号
static String separator
          与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串。 windows是\  linux是/
          *路径不能写死
          * C:\123\12\1.txt windows
          * C:/123/12/1.txt linux
          * "C:"+File.separator+"123"+File.separator+"12"+File.separator+"1.txt"
static char separatorChar
          与系统有关的默认名称分隔符。
*/

/*
* 路径：
* 绝对路径，是一个完整的路径
* C:\123\12\1.txt windows
 * 相对路径
 * 相对指的是当前目录的根目录，如果使用当前项目的根目录，路径可以简化书写
 * 注意：
 * 1，路径不区分大小写
 * 2，路径中的文件名称分隔符windows使用反斜杠\ 反斜杠是转义字符 ，两个反斜杠代表一个普通的反斜杠*/

import java.io.File;

public class Demo01File {
    public static void main(String[] args) {
        /*File类的构造方法
File(File parent, String child)
          根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
File(String pathname)
          通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
          可以是文件结尾，也可以文件夹结尾，相对路径绝对路径都可以，是否存在文件都可以，不考虑路径真假
File(String parent, String child)
          根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
File(URI uri)
          通过将给定的 file: URI 转换为一个抽象路径名来创建一个新的 File 实例。
*/
        //File(String pathname)根据路径的构造方法
        File file1 = new File("D:\\Java\\file\\a.txt");
        System.out.println(file1);//重写了toString方法
        File file2 = new File("D:\\Java\\file\\");
        System.out.println(file2);//重写了toString方法

        //File(String parent, String child) 父路径和子路径
        show01("D:\\","Java\\file\\a.txt");
        //File(File parent, String child)
        show02(file2,"a.txt");
    }

    private static void show02(File filepath, String path) {
        File file = new File(filepath, path);
        System.out.println(file);
    }

    private static void show01(String path1, String path2) {
        File file = new File(path1, path2);
        System.out.println(file);
    }
}
