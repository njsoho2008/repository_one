package ch15.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPClient {
    public static void main(String[] args) {
//        创建一个空的数组
        byte[] bytes=new byte[1024];
//        创建数据包
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length);
        try {
            DatagramSocket  socket=new DatagramSocket(8000);
            System.out.println("数据接收中...");
            socket.receive(dp);
            System.out.println("数据接收完成...");
            byte[] recData=dp.getData();
            System.out.println("接收到的数据为："+new String(recData,0,recData.length));

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
