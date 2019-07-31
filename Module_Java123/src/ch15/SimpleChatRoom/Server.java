package ch15.SimpleChatRoom;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    public static void main(String[] args) {
        Vector<UserThread> vector = new Vector<>();
        ExecutorService executor = Executors.newFixedThreadPool(3);
        try {
            ServerSocket server = new ServerSocket(8888);
            System.out.println("服务器已经启动.....");
            while (true) {
                Socket s = server.accept();
                UserThread user = new UserThread(s, vector);
                executor.execute(user);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

class UserThread implements Runnable {
    //    客户端的用户名,唯一的
    private String name;
    private Socket s;
    private Vector<UserThread> vector;//客户端处理线程的集合
    private ObjectInputStream ois;  //读取服务端
    private ObjectOutputStream oos; //输出到服务器
    private boolean flag;


    public UserThread(Socket s, Vector<UserThread> vector) {
        this.s = s;
        this.vector = vector;
        vector.add(this);
    }

    @Override
    public void run() {
        System.out.println("客户端:" + s.getInetAddress().getHostAddress() + "已经连接");
        try {
            ois = new ObjectInputStream(new BufferedInputStream(s.getInputStream()));


            oos = new ObjectOutputStream(new BufferedOutputStream(s.getOutputStream()));

            while (flag) {
                Message msg = (Message) ois.readObject();
                int type = msg.getType();
                switch (type) {
                    case MessageType.TYPE_SEND:
                        String to = msg.getTo();
                        UserThread ut;
                        int k = vector.size();
                        for (int i = 0; i < k; i++) {
                            ut = vector.get(i);
                            if (to.equals(ut.name) && ut != this) {
                                ut.oos.writeObject(msg);
                                break;
                            }
                        }
                        break;
                    case MessageType.TYPE_LOGIN:
                        name = msg.getFrom();
                        msg.setInfo("欢迎您" + name);
                        oos.writeObject(msg);
                        break;

                }
            }
            ois.close();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
