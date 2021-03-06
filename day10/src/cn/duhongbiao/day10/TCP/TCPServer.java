package cn.duhongbiao.day10.TCP;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

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
        /*让服务器一直处于监听状态，（死循环）
        * 有一个客户端上传文件，我们就保存一个*/
        while (true) {
            /*使用多线程基础，提高程序的效率，只要有一个客户端上传文件，我就开启一个线程，完成文件的上传*/
            Socket socket = serverSocket.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    //完成文件的上传
                    try {
                        //3
                        InputStream inputStream = socket.getInputStream();
                        //4
                        File file = new File("D:\\Java\\file\\ServerData");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        //5
                        /*优化文件名称被写死，导致每次上传写入的都是同一个文件
                         * 自定义一个文件的命名规则，防止同名的文件被覆盖
                         * 规则：域名+毫秒值+随机数*/
                        String fileName = "//itcast"+System.currentTimeMillis()+new Random(9999).nextInt()+".txt";
                        FileOutputStream fileOutputStream = new FileOutputStream(file.getPath()+fileName);
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
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }).start();

        }
        //服务器不用关闭
//        serverSocket.close();
    }
}
