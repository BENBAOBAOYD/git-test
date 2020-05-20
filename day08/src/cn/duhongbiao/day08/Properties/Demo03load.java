package cn.duhongbiao.day08.Properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
* void load(InputStream inStream)
          从输入流中读取属性列表（键和元素对）。
 void load(Reader reader)
          按简单的面向行的格式从输入字符流中读取属性列表（键和元素对）。
使用步骤：
* 1，创建Properties集合对象
* 2，使用load方法读取数据
* 3，遍历Properties集合
* 注意：
* 1，存储键值对的文件中，键与值的链接符号可以是=，空格（其他符号）
* 2，存储键值对的文件中可以用#进行注释
* 3，存储键值对的文件中，键与值的默认都是字符串，不用再加引号*/
public class Demo03load {
    public static void main(String[] args) {
        FileReader fr = null;
        Properties properties = new Properties();
        try {
            fr = new FileReader("D:\\Java\\file\\b.txt");
            properties.load(fr);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(properties);

    }
}
