package cn.duhongbiao.day09.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
*PrintStream:打印流
*特点
* 1，只负责数据的输出，不负责数据的读取
* 2，与其他输出流不同，永远不会抛出IO异常
* 3，有特有的方法
* System类的的静态方法
* static void setIn(InputStream in)
          重新分配“标准”输入流。
static void setOut(PrintStream out)
          重新分配“标准”输出流。
*/
public class Demo01PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("D:\\Java\\file\\files\\d.txt");
        System.setOut(ps);
        System.out.println(97+"\n"+"12345");
        ps.close();
    }
}
