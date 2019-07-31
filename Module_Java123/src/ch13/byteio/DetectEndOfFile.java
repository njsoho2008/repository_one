package ch13.byteio;

import java.io.*;

/*
检测到达文件尾巴
*
* */
public class DetectEndOfFile {
    //    volatile boolean isRunning = true;
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("c:/temp2.txt"))) {
            dos.writeUTF("毛泽东思想");
            dos.writeByte((byte)'a');
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream("c:/temp2.txt"));
            long startTime = System.currentTimeMillis();
            Thread thread = new Thread() {
                long t = 0;
                public void run() {
                    while (t < 15) {
                        try {
                            System.out.println(dis.readUTF());
                            System.out.println(dis.readByte());
                        } catch (EOFException ex) {
                            System.out.println("All data were read");

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        t = System.currentTimeMillis() - startTime;
                        System.out.println("t="+t);
                    }
                }
            };
            thread.start();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
