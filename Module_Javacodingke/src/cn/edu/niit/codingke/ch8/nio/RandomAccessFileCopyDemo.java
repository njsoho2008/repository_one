package cn.edu.niit.codingke.ch8.nio;

import java.io.*;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

//RandomAccessFile 类是内存中的操作  文件的映射拷贝
/*
* IO 速度比较
*
* 内存映射最快
* NIO
* 使用了缓冲的IO
* 无缓冲的IO
*
* */

public class RandomAccessFileCopyDemo {
    public static void RandomAccessFC(){
        try {
            RandomAccessFile rafin=new RandomAccessFile("c:\\test\\my\\昂科威车型手册.pdf","r");
            RandomAccessFile rafout=new RandomAccessFile("c:\\test\\昂科威车型手册.pdf","rw");
            FileChannel fin=rafin.getChannel();
            FileChannel fout=rafout.getChannel();
            long size=fin.size();//输入流的大小

//输入流的缓冲区
            MappedByteBuffer inbuf=fin.map(FileChannel.MapMode.READ_ONLY,0,size);

//          输出流的缓冲区
            MappedByteBuffer outbuf=fout.map(FileChannel.MapMode.READ_WRITE,0,size);

//
            for(int i=0;i<size;i++){
                outbuf.put(inbuf.get(i));
                outbuf.clear();
                inbuf.clear();
            }

            //关闭通道时候，写入数据
            fin.close();
            fout.close();
            rafin.close();
            rafout.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("文件复制完成！");

    }
    public static  void main(String[] args){
        RandomAccessFC();
    }
}
