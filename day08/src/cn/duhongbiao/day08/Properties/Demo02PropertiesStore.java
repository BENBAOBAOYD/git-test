package cn.duhongbiao.day08.Properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
* 可以使用store方法来把集合中的临时数据存储到硬盘当中
* void store(OutputStream out, String comments)
          以适合使用 load(InputStream) 方法加载到 Properties 表中的格式，将此 Properties 表中的属性列表（键和元素对）写入输出流。
* 使用步骤：
* 1，创建properties集合
* 2，创建字节输出流，或字符输出流
* 3，使用store方法
* 4，释放资源*/
public class Demo02PropertiesStore {
    public static void main(String[] args) throws IOException {
        //1，创建properties集合
        Properties properties = new Properties();
        properties.setProperty("1","10");
        properties.setProperty("2","20");
        properties.setProperty("3","30");
        //2，创建字节输出流，或字符输出流
        FileWriter fw = new FileWriter("D:\\Java\\file\\b.txt");
        //3，使用store方法
        properties.store(fw,"save date");
        //4，释放资源
        fw.close();
    }
}
