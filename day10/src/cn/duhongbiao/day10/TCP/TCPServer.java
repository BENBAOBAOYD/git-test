package cn.duhongbiao.day10.TCP;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*文件上传案例的服务器端，将客户端上传文件保存到服务器的硬盘，并给客户端回传上传成功

* 步骤
1，创建一个ServerSocket对象，和系统要制定的端口号
2，使用accept方法获得客户端的socket对象
3，使用socket对象获得网络字节输入流
4，判断D:\Java\file\ServerData文件夹是否村子啊，如果没有则创建
5，创建一个本地字节输出流，绑定输出流的目的地
6，使用网络字节输入流的read方法读取客户端上传的文件
7，使用本地字节输出流的write方法把读取到文件保存到服务器的硬盘上
8，使用socket对象获得网络字节输出流
9，使用网络字节输出流的write方法给客户端回复
10，释放资源*/
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //1
        ServerSocket serverSocket = new ServerSocket(8888);
        //2
        Socket socket = serverSocket.accept();
        //3
        InputStream inputStream = socket.getInputStream();
        //4
        File file = new File("D:\\Java\\file\\ServerData");
        if (!file.exists()) {
            file.mkdirs();
        }
        //5
        FileOutputStream fileOutputStream = new FileOutputStream(file+"\\a.txt");
        //6
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = inputStream.read(bytes)) !=-1) {
            //7
            fileOutputStream.write(bytes,0, len);
        }
        //8 9
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("文件已收到".getBytes());
        //10
        fileOutputStream.close();
        socket.close();
        serverSocket.close();
    }
}
