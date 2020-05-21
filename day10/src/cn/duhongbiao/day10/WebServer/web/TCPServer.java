package cn.duhongbiao.day10.WebServer.web;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    /*注意浏览器请求的时候不要使用https协议，而使用http协议就不会产生乱码了*/
    public static void main(String[] args) throws IOException {
        //创建一个服务器ServerSocket，和系统要端口号
        ServerSocket serverSocket = new ServerSocket(8000);
        while (true) {
            //获取到请求的客户端对象
            Socket socket = serverSocket.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        //获取网络输入流对象
                        InputStream inputStream = socket.getInputStream();
                        //read
//        int len;
//        byte[] bytes = new byte[1024];
//        while ((len = inputStream.read(bytes)) != -1) {
//            System.out.println(new String(bytes, 0, len));
//        }
                        /*服务器要回复给一个html页面文件
                         * 我们需要读取这个index.html文件，就必须知道这个文件的地址
                         * 而这个地址就是请求信息的第一行GET /D:/Java/JavaNext/day10/src/cn/duhongbiao/day10/WebServer/web/index.html HTTP/1.1
                         * 可以使用BufferedReader 的readline方法读取第一行
                         * 然后使用String中的Split方法切割字符串获取中间的部分/D:/Java/JavaNext/day10/src/cn/duhongbiao/day10/WebServer/web/index.html
                         * 然后吧第一个/去掉使用subString方法
                         * 客户端创建一个本地字节输入流根据获取到的文件路径读取html文件
                         * 然后使用网络字节输出流，把读取到的文件返回到客户端显示
                         * // 写入HTTP协议响应头,固定写法
                         *  out.write("HTTP/1.1 200 OK\r\n".getBytes());
                         *  out.write("Content‐Type:text/html\r\n".getBytes());
                         * // 必须要写入空行,否则浏览器不解析
                         *  out.write("\r\n".getBytes());*/
        /*发现浏览器中出现很多的叉子,说明浏览器没有读取到图片信息导致。
        浏览器工作原理是遇到图片会开启一个线程进行单独的访问,因此在服务器端加入线程技术。*/


                        //把网络字节输入流转化为字符缓冲输入流
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        //把客户端请求信息的第一行读取出来
                        String line = bufferedReader.readLine();
                        System.out.println(line);
                        //把读取的信息进行切割，只要中间的部分
                        String[] array = line.split(" ");
                        //再把路径前面的/去掉
                        String htmlPath = array[1].substring(1);
//        System.out.println(htmlPath);
                        //读取本地文件，创建一个本地的字节输入流
                        FileInputStream fileInputStream = new FileInputStream(htmlPath);
                        //把读取到的本地文件写入到客户端，获取网络字节输出流
                        OutputStream outputStream = socket.getOutputStream();
                        // 写入HTTP协议响应头,固定写法
                        outputStream.write("HTTP/1.1 200 OK\r\n".getBytes());
                        outputStream.write("Content‐Type:text/html\r\n".getBytes());
                        // 必须要写入空行,否则浏览器不解析
                        outputStream.write("\r\n".getBytes());
                        //一读一写复制文件
                        int len;
                        byte[] bytes = new byte[1024];
                        while ((len = fileInputStream.read(bytes)) != -1) {
                            outputStream.write(bytes, 0, len);
                        }
                        //释放资源
                        fileInputStream.close();
                        socket.close();
//                        serverSocket.close();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }).start();

        }
    }
}
