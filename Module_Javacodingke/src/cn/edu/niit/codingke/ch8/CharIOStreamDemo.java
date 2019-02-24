package cn.edu.niit.codingke.ch8;

import java.io.*;

//字符流
//字符输出流 Writer，通过FileWriter 实例化，来实现对文件的写操作
//字符输入流 Reader，通过FileReader实例化，来实现对文件的读操作
//每个字母一个字符，每个中文一个字符
//解决多字符文本问题

public class CharIOStreamDemo {

   public  static   File  wrfile=new File("c:\\test\\my\\wrfile.txt");


     public static void writerTo(){
         try {

             FileWriter fileWriter = new FileWriter(wrfile,true);
           fileWriter.write("小桥流水,");
           fileWriter.close();
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
     public  static  void readFrom(){
         try {
             FileReader fileReader=new FileReader(wrfile);
              char[] saveforread=new char[1];
              int len=-1;
             try {
                 StringBuilder stringBuilder=new StringBuilder();
                 while ((len=fileReader.read(saveforread))!=-1){
                    stringBuilder.append(new String(saveforread,0,len));
                 }
                 fileReader.close();
                 System.out.println(stringBuilder.toString());
             } catch (IOException e) {
                 e.printStackTrace();
             }
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         }


     }

    public static void main(String[] args){
    writerTo();
    readFrom();
    }

}
