package ch15.UDP.MultiThreadUDP;

import java.io.IOException;
import java.net.*;

//服务器，发送数据端，在Client 启动后再启动Server
public class UDPServer {
    public static void main(String[] args) {
//        构建DatagramPacket 对象
        String str = "hello good good study,day day up";
        byte[] bytes = str.getBytes();

        try {
            //构造数据报包，用来将长度为 length 偏移量为 offset 的包发送到指定主机上的指定端口号。
            DatagramPacket datagramPacket = new DatagramPacket(bytes, 0, bytes.length, InetAddress.getByName("127.0.0.1"), 8000);
           //创建数据报套接字并将其绑定到本地主机上的指定端口。
            DatagramSocket socket = new DatagramSocket(9000);
            /*SocketAddress address=socket.getLocalSocketAddress();
            socket.bind(address);*/
            socket.send(datagramPacket);
            System.out.println("发送结束");
            socket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
