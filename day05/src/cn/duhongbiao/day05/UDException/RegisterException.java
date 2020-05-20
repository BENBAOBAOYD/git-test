package cn.duhongbiao.day05.UDException;

/*自定义异常类
*   xxx extends Exception|RuntimeException{
*       添加一个空参构造方式
*       添加一个代异常信息的构造方法
*   }
* 注意：
*   1，自定义异常类一般都是以Exception结尾，说明该类是一个异常类
*   2，自定义异常类，必须的继承Exception或RuntimeException
*       */
public class RegisterException extends Exception{
    public RegisterException() {
        super();
    }
    /*查看源码发现，都会有带一个异常信心的构造方法
    * 方法内部内调用父类带异常信息的构造犯法，让父类来处理这个异常信息*/
    public RegisterException(String message){
        super(message);
    }
}
