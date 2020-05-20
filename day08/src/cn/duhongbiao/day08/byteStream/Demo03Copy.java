package cn.duhongbiao.day08.byteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*使用流；来复制文件到另外一个位置*/
public class Demo03Copy {
    public static void main(String[] args)  {
        //读取
        try(FileInputStream fis = new FileInputStream("D:\\Java\\file\\a.txt");
            FileOutputStream fos = new FileOutputStream("D:\\Java\\file\\flies\\a.txt");) {
            //可能会出现异常的代码
            int len = 0;
            byte[] bytes = new byte[1024];
            while ((len = fis.read(bytes)) != -1) {
                //写入
                fos.write(bytes,0,len);
            }
            fos.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
