package ch15.TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
/*
* 三次握手 TCP/IP通信
*
*
* */
public class EchoServerDemo {
    public static void main(String[] args) {
//        服务器端口(1024-65535)

        try {
            ServerSocket serverSocket = new ServerSocket(6666);
            System.out.println("服务器已经启动，正在等待客户端连接....");
//            等待客户端来连接，会因为等待，造成阻塞；如果有客户端连接成功，则立即返回一个Socket
            Socket socket = serverSocket.accept();
            System.out.println("客户端连接成功，客户端地址是："+serverSocket.getInetAddress().getHostAddress());

            BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
//            通过输入流读取来自客户端的网络数据,如果没有数据读，也会造成阻塞，一致在那里等待
            String info=br.readLine();
            System.out.println("读入的数据是："+info);
//           往客户端 写数据

            PrintStream  pw=new PrintStream(new BufferedOutputStream((socket.getOutputStream())));
             pw.print(info);
             pw.flush();
//             pw.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
