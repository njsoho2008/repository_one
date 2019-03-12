package ch13.byteio;

import java.io.*;

/*
检测到达文件尾巴
*
* */
public class DetectEndOfFile {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("c:/temp2.txt"))) {
            dos.writeUTF("毛泽东思想");
            dos.writeDouble(99);
            dos.writeByte((byte) 'a');
            dos.writeInt(67);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            DataInputStream dis = new DataInputStream(new FileInputStream("c:/temp2.txt"));


            new Thread() {
                public void run() {
                    while (true) {
                        try {
                            System.out.println(dis.readDouble());
                        } catch (EOFException ex) {
                            System.out.println("All data were read");

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }.start();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
