package ch15.TCP;

import java.io.*;
import java.net.Socket;

public class EchoClientDemo {
    public static void main(String[] args) {
//        创建一个Socket ，指定要连接的服务器
        try {
            Socket socket = new Socket("127.0.0.1", 6666);
//            客户端输出流
            PrintStream client_ps = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));

//           客户端读入流
            BufferedReader client_br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            client_ps.println("hello , how are you!++ ");
            client_ps.flush();
            String info = client_br.readLine();
            System.out.println("客户端读取的数据：" + info);

            client_br.close();
            client_ps.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
