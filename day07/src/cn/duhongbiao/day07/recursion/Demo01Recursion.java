package cn.duhongbiao.day07.recursion;

import java.io.File;

/*递归打印多级目录
* p普通便利只能遍历单级文件夹*/
public class Demo01Recursion {
    public static void main(String[] args) {
        File file = new File("D:\\Java\\file");
        getFiles(file);
    }
    /*定义一个方法，参数传输File类型的目录，
    * 方法中对目录进行遍历*/
    private static void getFiles(File file) {
        System.out.println(file);
        File[] files1 = file.listFiles();
        for (File f : files1) {
            if (f.isDirectory() == true){
                getFiles(f);
            }
            System.out.println(f);
        }
    }
}
