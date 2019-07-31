package ch15.UDP.MultiThreadUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiUDPClient {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        try {
            DatagramSocket socket = new DatagramSocket(8000);

            System.out.println("数据接收中...");
            while (true) {

               executor.execute(new receiver(socket));

            }
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class receiver implements Runnable {
    private  DatagramSocket socket;

    private DatagramPacket dp;
//    private  int i;

    public receiver(DatagramPacket dp) {
        this.dp = dp;
    }

    public receiver() {
    }

    public receiver(DatagramSocket socket) {
        this.socket = socket;


    }

    @Override

    public void run() {
//        创建一个空的数组
        byte[] bytes = new byte[1024];
//        创建数据包
        dp = new DatagramPacket(bytes, bytes.length);
        try {



            socket.receive(dp);
            byte[] recData = dp.getData();
//            if(recData!=null){
//                System.out.println("第"+(i++)+"波数据");
//            }
            System.out.println("接收到的数据为：" + new String(recData, 0, recData.length));
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
