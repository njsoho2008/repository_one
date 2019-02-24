package cn.edu.niit.codingke.ch8;

import java.io.*;

//ByteArrayStream
//字节数组流，基于内存操作，内部维护着一个数组，可以利用流的读取操作
public class ByteArrayStreamDemo {

   public  static  void byteArrayReader(String s){


           ByteArrayInputStream bais=new ByteArrayInputStream(s.getBytes());
           ByteArrayOutputStream baos=new ByteArrayOutputStream();
           int curr=-1;//每次读取的字节
          while((curr=bais.read())!=-1){
               if((curr>=65&&curr<=95)||(curr>=97&&curr<=122)){
                   baos.write(curr);
               }

          }
          //此时不用不用关闭流，因为ByteArray流是内存操作流
           System.out.println(baos.toString());


   }

    public static  void main(String[] args){
  String s="ew58rq0w8qwerq-werq-rr";
byteArrayReader(s);
    }
}
