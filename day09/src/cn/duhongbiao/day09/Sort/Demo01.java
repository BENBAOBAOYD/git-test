package cn.duhongbiao.day09.Sort;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*对文本内容进行按编号排序
* 分析
* 1，创建一个hashMap集合，键值对来存储序号和文本内容
* 2，创建字符缓冲输入流对象
* 3，创建字符缓冲输出流对象
* 4，使用readline方法逐行读取文本
* 5，对读取到文本进行切割，获取序号和文本内容
* 6，把切割好的序号和文本内容放入到hashMap集合
* 7，遍历hashMap集合获取每一个键值对
* 8，把每一个键值对拼接为一行文本
* 9，把拼接的文本内容输出到文件当中
* 10，释放资源*/
public class Demo01 {
    public static void main(String[] args) throws IOException {
        //1
        HashMap<String, String> hashMap = new HashMap<>();
        //2
        BufferedReader br = new BufferedReader(new FileReader("D:\\Java\\file\\排序.txt"));
        //3
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Java\\file\\sortResult.txt"));
        String line;
        //4
        while ((line = br.readLine()) != null) {
            //5
            String[] entry = line.split("\\.");
            //6
            hashMap.put(entry[0],entry[1]);
        }
        //7
        String String;
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            //8
            String = key +"."+ value;
            //9
            bw.write(String);
            bw.newLine();
        }
        //10
        br.close();
        bw.close();

    }
}
