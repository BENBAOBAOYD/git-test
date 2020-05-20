package cn.duhongbiao.day08.charStream;

/*
* - `void write(int c)` 写入单个字符。
- `void write(char[] cbuf) `写入字符数组。
- `abstract  void write(char[] cbuf, int off, int len) `写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
- `void write(String str) `写入字符串。
- `void write(String str, int off, int len)` 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
- `void flush() `刷新该流的缓冲。
- `void close()` 关闭此流，但要先刷新它。 */


import java.io.FileWriter;
import java.io.IOException;

/*
* `java.io.FileWriter `类是写出字符到文件的便利类。构造时使用系统默认的字符编码和默认字节缓冲区。

### 构造方法

- `FileWriter(File file)`： 创建一个新的 FileWriter，给定要读取的File对象。
- `FileWriter(String fileName)`： 创建一个新的 FileWriter，给定要读取的文件的名称。

当你创建一个流对象时，必须传入一个文件路径，类似于FileOutputStream。
* 字符输出流的使用步骤：
* 1，创建FileWriter对象，并传入写入数据的目的地
* 2，使用write方法，把数据写入到内存缓冲区当中(把字符转化为字节)
* 3，使用flush把内存缓冲区的中的数据刷新到文件中
* 4，释放资源，*/
public class Demo02Writer {
    public static void main(String[] args)  {
        /*提高变量的作用域让finally可以使用
        * 变量在定义的时候可以没有值，但是在使用的时候一定要有值
        * 所以要给其*/
        FileWriter fw = null;
        try {
            fw = new FileWriter("D:\\Java\\file\\b.txt",true);
            char[] chars = new char[] {'你','好','呀'};
            String string = "我不好\n";
            fw.write(chars,0,chars.length);
            fw.write(string);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //如果创建对象失败了，那么fw为null，那么close就会抛出空指针异常，所以需要判断一下fw是否为空
            if(fw != null) {
                try {
                    fw.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

//        fw.close();
        /*
        * 因为内置缓冲区的原因，如果不关闭输出流，无法写出字符到文件中。但是关闭的流对象，是无法继续写出数据的。如果我们既想写出数据，又想继续使用流，就需要`flush` 方法了。
         * `flush` ：刷新缓冲区，流对象可以继续使用。
         * `close `:先刷新缓冲区，然后通知系统释放资源。流对象不可以再被使用了。*/


    }
}
