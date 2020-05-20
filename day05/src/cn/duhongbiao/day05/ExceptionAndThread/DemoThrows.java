package cn.duhongbiao.day05.ExceptionAndThread;

import java.io.FileNotFoundException;
import java.io.IOException;

/*throws关键字：异常处理的第一种方式，交给别人处理
* 作用：当方法内部抛出异常对象的时候，那么我们就必须处理这个异常对象
* 可以使用throws关键字处理异常对象，回把异常对象生命给调用者处理，最终交给JVM处理
* 使用格式：在方法声明时使用
*   修饰符 返回值类型 方法名（参数列表）throws AAAException{
*   throw new AAAException（"XXX"）
* }
* 注意：
*   1，throws关键字必须写在方法的声明出
*   2，throws关键字后边声明的异常对象，那么throws后边必须也声明多个异常
*   3，如果抛出的多个异常对象有子父类关系，那么声明㺑异常即可
*   4，调用了一个声明抛出异常的方法，我们就必须处理声明的异常
*   要么使用throws抛给方法的使用者
*   要么try catch*/
public class DemoThrows {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        //Error:(22, 17) java: 未报告的异常错误java.io.FileNotFoundException; 必须对其进行捕获或声明以便抛出
        readFile("C:\\a.jpg");
    }
    /*定义一个方法，对传递文件的路径进行合法性判断
    * 如果路径不是"C:\\a.txt"那么就排除文件找不到异常对象，告知方法的使用者
    * FileNotFoundException是编译异常，就必须处理这个异常
    * 可以使用throws继续声明抛出s异常这个异常对象，让方法的调用者处理*/
    public static void readFile(String filePath) throws FileNotFoundException, IOException {
        if (!filePath.equals("C:\\a.txt")) {
            throw new FileNotFoundException("文件路径不对");
        }
        /*如果不是.txt结尾，抛出IO异常对象，告知方法的调用者，文件的后缀名不对
        * */
        if (!filePath.endsWith(".txt")) {
            throw new IOException("传递的文件格式有问题");
        }
        System.out.println("路径没有问题");
    }
}
