package ch15.TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//同时处理多个客户端
public class MultiEchoServerDemo {
    public static void main(String[] args) {
        ExecutorService executor=Executors.newFixedThreadPool(3);
        try {
            ServerSocket serverSocket = new ServerSocket(6666);
            System.out.println("服务器已经启动，等待连接....");
            while (true) {
                Socket s = serverSocket.accept();
                System.out.println(s.getInetAddress().getHostAddress());
                executor.execute(new UserThread(s));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class UserThread implements Runnable {
    private Socket s;
    public UserThread(Socket s) {
        this.s = s;
    }
    @Override
    public void run() {
        try {
            //  读入
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            //输出
            PrintStream ps = new PrintStream(new BufferedOutputStream(s.getOutputStream()));
            String str = br.readLine();
            System.out.println(str);
            ps.println("输出来自客户端的数据" + str);
            ps.flush();
            ps.close();
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
