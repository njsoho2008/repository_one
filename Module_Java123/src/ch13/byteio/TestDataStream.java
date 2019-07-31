package ch13.byteio;

import java.io.*;
import java.security.DigestInputStream;

public class TestDataStream {
    public static void mymethod_dataio(){
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("c:/temp.dat"))) {
            dos.writeUTF("移动1823");
            dos.writeUTF("Java程序设计");
            dos.writeDouble(85.0);
            dos.writeUTF("IOS Program");
            dos.writeDouble(99);
            dos.writeUTF("毛泽东思想");
            dos.writeInt(19);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (DataInputStream dis = new DataInputStream(new FileInputStream("c:/temp.dat"))) {
            System.out.println(dis.readUTF());
            System.out.println(dis.readUTF()+"   "+dis.readDouble());
            System.out.println(dis.readUTF()+"   "+dis.readDouble());
            System.out.println(dis.readUTF()+"   "+dis.readInt());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        mymethod_dataio();



    }
}
