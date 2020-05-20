package cn.duhongbiao.day05.ExceptionAndThread;

import java.io.FileNotFoundException;
import java.io.IOException;

/*异常处理的第二种方法
* 自己处理异常
* 格式：
* try{
*   可能产生异常的代码
* }catch（定义一个异常的变量，用来接收try中抛出的异常对象）{
*
* }
* 注意：
* 1，try中可能会抛出多个异常对象，那么就可以使用多个catch来处理这些个异常对象
* 2，如果try中产生了异常，那么就会执行catch中的异常处理逻辑，执行完毕catch中的处理逻辑，
* 继续执行try catch之后的代码
* 如果try中没有产生异常，那么就不会执行catch中异常的处理逻辑，执行完try中的代码继续执行trycatch之后的代码
* */
public class DemoTryCatch {
    public static void main(String[] args) {
        try {
            //可能产生异常的代码
            readFile("C:\\a.xt");
        }catch (IOException e) {//抛出什么异常就定义什么异常变量，用来接收这个异常对象
//            System.out.println("传递为文件后缀不是.txt");
                    /*Throwable类中定义了三个处理异常的方法
             * 1.String getMessage()
             * 返回此 throwable 的简短消息。
             * 2. String toString()
             * 返回此 throwable 的详细描述。
             * 3. void printStackTrace()
          将此 throwable 及其追踪输出至标准错误流。
             * */
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }finally {
            System.out.println("资源释放");
        }
        System.out.println("后续代码");
    }
    public static void readFile(String filePath) throws IOException {
        /*如果不是.txt结尾，抛出IO异常对象，告知方法的调用者，文件的后缀名不对
         * */
        if (!filePath.endsWith(".txt")) {
            throw new IOException("传递的文件格式有问题");
        }
        System.out.println("路径没有问题");
    }
}
