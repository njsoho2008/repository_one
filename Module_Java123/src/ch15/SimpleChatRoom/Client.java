package ch15.SimpleChatRoom;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ExecutorService es = Executors.newFixedThreadPool(3);

        try {
            Socket socket = new Socket("localhost", 8888);
            System.out.println("连接成功！");

//            ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(socket.getInputStream()));
//            ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(socket.getOutputStream()));
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
//          向服务器发送登录信息
           System.out.println("请输入名称：");
            String name = input.nextLine();
            Message message = new Message(name, null, MessageType.TYPE_LOGIN, null);
            oos.writeObject(message);
            message = (Message) ois.readObject();
            System.out.println("echo from server:" +message.getFrom()+ message.getInfo());
//            启动读取消息的线程

            es.execute(new readThread(ois));

//            使用主线程发送消息
            boolean flag=true;
            while (flag){
                message=new Message();
                System.out.println("To");
                message.setTo(input.nextLine());
                message.setFrom(name);
                message.setType(MessageType.TYPE_SEND);
                System.out.println("info ：");
                message.setInfo(input.nextLine());
                oos.writeObject(message);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

class readThread implements Runnable {
    private ObjectInputStream in;
    boolean flag = true;

    public readThread(ObjectInputStream in) {
        this.in = in;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {

        try {
            while (flag) {
                Message message = (Message) in.readObject();
                String name = message.getFrom();
                System.out.println("[" + name + "对我说]:" + message.getInfo());
            }
            if (in != null) {
                in.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
