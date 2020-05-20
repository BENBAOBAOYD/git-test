package cn.duhongbiao.day08.charStream;

import java.io.FileReader;
import java.io.IOException;

/*使用字节流读取中文的时候会产生乱码
* 所以要使用字符流
* `java.io.Reader`抽象类是表示用于读取字符流的所有类的超类，可以读取字符信息到内存中。它定义了字符输入流的基本共性功能方法。
- `public void close()` ：关闭此流并释放与此流相关联的任何系统资源。
- `public int read()`： 从输入流读取一个字符。
- `public int read(char[] cbuf)`： 从输入流中读取一些字符，并将它们存储到字符数组 cbuf 。
* */
public class Demo01Reader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\Java\\file\\b.txt");
        char[] chars = new char[1024];
        int len = 0;
        while ((len = fr.read(chars)) != -1) {
            System.out.println(new String(chars,0,len));
        }
        fr.close();
    }
}
