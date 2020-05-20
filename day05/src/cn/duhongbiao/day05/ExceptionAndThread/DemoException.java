package cn.duhongbiao.day05.ExceptionAndThread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.NoSuchElementException;

/*java.lang.Throwable是java语言中所有错误或者异常的超累
*       Exception:编译期异常,进行编译时候java程序运行过程中出现的问题
*       RunTimeException:运行其异常,java程序运行中出现的问题
*   异常就相当于了程序得了一个小毛病,把异常处理,程序可继续执行
*   Error:错误
*       无法治愈,必须修改代码*/
public class DemoException {
    public static void main(String[] args)/* throws ParseException*/ {
//        demoThrow();
//        demoTryCatch();
//        demoRunTimeException();
        /*OutOfMemoryError
        * 内存溢出，创建的数组太大了，超出了给JVM分配的内存*/
        demoError();
    }

    private static void demoError() {
        int[] arr = new int[1024*1024*1024];
    }

    private static void demoRunTimeException() {
        int[] arr = {1,2,3};
        try {
            System.out.println(arr[3]);

        }catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("后续");
    }

    private static void demoTryCatch() {
        //demoTryCatch();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date2 = sdf.parse("1997-0812");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("后续代码");
    }

    private static void demoThrow () throws ParseException {
        //Exception
        //throw
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse("1997-08-12");
    }
}
