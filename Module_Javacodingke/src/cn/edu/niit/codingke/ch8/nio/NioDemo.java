package cn.edu.niit.codingke.ch8.nio;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public class NioDemo {
    public static void main(String[] args){
        ByteBuffer buf=ByteBuffer.allocate(1024);
        System.out.println("positon:"+buf.position());
        System.out.println("limit:"+buf.limit());
        System.out.println("capacity"+buf.capacity());
        System.out.println("---------------------------");
   //向缓冲区写数字
        buf.put((byte)11);
        buf.put((byte)19);
        buf.put((byte)22);
        buf.put((byte)39);

        System.out.println("positon:"+buf.position());
        System.out.println("limit:"+buf.limit());
        System.out.println("capacity"+buf.capacity());
//    缓冲区反转
        Buffer nbuf=buf.flip();
        System.out.println("---------------------------");
        System.out.println("positon:"+buf.position());
        System.out.println("limit:"+buf.limit());
        System.out.println("capacity"+buf.capacity());
        System.out.println("---------------------------");
        //告知当前位置与limit之间，有无元素
        if(buf.hasRemaining()) {
           for (int i=0;i<buf.remaining();i++){
               byte b=buf.get(i);
               System.out.println(b);
           }

        }
    }
}
