package cn.edu.niit.codingke.ch8;
//数据输出流允许应用程序以适当方式将基本 Java 数据类型写入输出流中。
// 然后，应用程序可以使用数据输入流将数据读入。

import java.io.*;

public class DataOutputStreamDemo {

    public static  void DataReader(File file){
        try {
            InputStream in=new FileInputStream(file);
            BufferedInputStream bis=new BufferedInputStream(in);

            DataInputStream dis=new DataInputStream(bis);
            try {

//                int i=dis.readInt();
//                Byte b=dis.readByte();
               char ch=dis.readChar();
              String s=dis.readUTF();


              System.out.println(ch);

                System.out.println(s);
//                System.out.println("读出刚刚写入的内容："+b+"-"+i+"-"+s);
                dis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public  static  void DataWrite(File file){
        OutputStream os= null;
        try {
            os = new FileOutputStream(file,true);
            BufferedOutputStream bos=new BufferedOutputStream(os);
            DataOutputStream dos=new DataOutputStream(bos);
            try {

//                dos.writeInt(10);
//                dos.writeByte(122);
                dos.writeChar('h');
                dos.writeUTF("中华人民共和国\n");
                dos.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }


    public static  void main(String[] args){
        File file=new File("c:\\test\\my\\dataStream.txt");

       DataWrite(file);
       DataReader(file);
    }

}
