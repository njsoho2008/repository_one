package cn.edu.niit.codingke.ch8.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;

public class FileCopy_NioDemo {

    public static void  copyfile(){
        try {
            FileChannel fcin=new FileInputStream("c:\\test\\my\\first.doc").getChannel();
            FileChannel fcout=new FileOutputStream("c:\\test\\first.doc").getChannel();

            ByteBuffer buf=ByteBuffer.allocate(1024);

             while (fcin.read(buf)!=-1){
                 buf.flip();
                 fcout.write(buf);
                 buf.clear();
             }

             fcout.close();
             fcin.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("文件拷贝结束！");
    }
    public  static  void  main(String[] args){
        copyfile();

    }

}
