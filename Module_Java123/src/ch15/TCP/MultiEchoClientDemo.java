package ch15.TCP;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class MultiEchoClientDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        创建一个Socket ，指定要连接的服务器
        try {
            Socket socket = new Socket("127.0.0.1", 6666);
//            客户端输出流
            PrintStream ps = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));

//           客户端读入流，从服务端读取
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("请输入：");
            String info = input.nextLine();
            ps.println("客户端输出的信息是" + info);
            ps.flush();
            info = br.readLine();
            System.out.println("从服务端读取的数据：" + info);
            ps.close();
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
