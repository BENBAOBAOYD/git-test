package cn.duhongbiao.day10.TCP;

import java.io.*;
import java.net.Socket;

/*文件上传的客户端
* 明确数据源，目的地服务器
* 实现步骤，、
* 1，创建本地字节输入流
* 2，创建客户端对象，要绑定服务器的IP地址和端口号
* 3，使用socket成员方法获得网络输出流OutputStream对象
* 4，使用本地输入里的read读取文件
* 5，使用网络输出流方法write，上传到服务器
* 6，获得网络输入流对象
* 7，使用网络输入流对象的read读取服务器回传数据
* 8，释放资源*/
public class TCPClient {
    public static void main(String[] args) throws IOException {
        //1
        FileInputStream fileInputStream = new FileInputStream("D:\\Java\\file\\ClientData\\a.txt");
        //2
        Socket socket = new Socket("127.0.0.1",8888);
        //3
        OutputStream outputStream = socket.getOutputStream();
        //4
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fileInputStream.read(bytes)) != -1) {
            //5
            outputStream.write(bytes,0,len);
        }
        //6
        InputStream inputStream = socket.getInputStream();
        while ((len = inputStream.read(bytes)) != -1) {
            //7
            System.out.println(new String(bytes,0, len));
        }
        fileInputStream.close();
        socket.close();
    }
}
