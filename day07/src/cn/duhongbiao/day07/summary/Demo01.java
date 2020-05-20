package cn.duhongbiao.day07.summary;

import java.io.File;

/*文件搜寻
D:\Java\file
* 只要.txt结尾的文件*/
public class Demo01 {
    public static void main(String[] args) {
        File file = new File("D:\\Java\\file");
        getFiles(file);
    }
    /*定义一个方法，参数传输File类型的目录，
     * 方法中对目录进行遍历*/
    private static void getFiles(File file) {
        File[] files1 = file.listFiles();
        for (File f : files1) {
            if (f.isDirectory() == true){
                getFiles(f);
            }
            if (f.toString().toLowerCase().endsWith(".txt") == true) {
                System.out.println(f);
            }
        }
    }
}
