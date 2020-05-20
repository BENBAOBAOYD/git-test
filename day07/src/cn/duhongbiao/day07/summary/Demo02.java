package cn.duhongbiao.day07.summary;

import java.io.File;

/*文件搜寻
D:\Java\file
* 只要.txt结尾的文件
使用过滤器来实现
File[] listFiles(FileFilter filter)
          返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
          FileFilter接口
          boolean accept(File dir, String name)
          测试指定文件是否应该包含在某一文件列表中。
File[] listFiles(FilenameFilter filter)
          返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
          FilenameFilter接口
          实现此接口的类实例可用于过滤器文件名。Abstract Window Toolkit 的文件对话框组件使用这些实例过滤 File 类的 list 方法中的目录清单。
          boolean accept(File dir, String name)
          测试指定文件是否应该包含在某一文件列表中
注意：
两个过滤器接口是没有实现类的，需要我们自己写实现类，重写过滤方法accept，在方法中自定义过滤的规则
*/
public class Demo02 {
    public static void main(String[] args) {
        File file = new File("D:\\Java\\file");
        getFiles(file);
    }
    /*定义一个方法，参数传输File类型的目录，
     * 方法中对目录进行遍历*/
    private static void getFiles(File file) {
        File[] files1 = file.listFiles(new FileFilterImpl());
        for (File f : files1) {
            if (f.isDirectory()) getFiles(f);
            else System.out.println(f);
        }
    }
}
