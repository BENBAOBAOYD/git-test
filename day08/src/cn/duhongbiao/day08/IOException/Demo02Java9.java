package cn.duhongbiao.day08.IOException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* JAVA9新特性
* try前边可以定义流对象
* 在try（）中可以直接引入流对象名称
* 在try执行完毕后，流对象也可以释放掉，不用谢finally*/
public class Demo02Java9 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("D:\\Java\\file\\a.txt");
        FileOutputStream fos = new FileOutputStream("D:\\Java\\file\\flies\\a.txt");
        //读取
        try (fis;fos) {
            //可能会出现异常的代码
            int len = 0;
            byte[] bytes = new byte[1024];
            while ((len = fis.read(bytes)) != -1) {
                //写入
                fos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
