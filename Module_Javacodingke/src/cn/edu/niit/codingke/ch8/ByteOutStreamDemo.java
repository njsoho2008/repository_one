package cn.edu.niit.codingke.ch8;
//OutputStream  是文件输出流的超类，是写操作

import java.io.*;
import java.util.Scanner;

public class ByteOutStreamDemo {
    private static double din=0.05;

    public static void out() throws IOException {
        File file=new File("c:" +
                "\\test\\my\\first.txt");
        try {
            OutputStream outputStream=new FileOutputStream(file,true);
            //我要输出到文件的内容
            String str="Java IO 章节\r\n";
            InputStream in=System.in;
            //控制台输入
            Scanner input=new Scanner(in);


           outputStream.write(input.nextLine().getBytes());
            outputStream.write(str.getBytes());
            outputStream.close();
            System.out.println("写入成功！");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void in(){
        File f=new File("c:" +
                "\\test\\my\\first.txt");
        try {
            InputStream inputStream=new FileInputStream(f);
            //定义一个字节数组，加载first.doc中的内容
            byte[] arrayb=new byte[10*1024];
            int len=-1;
//             等于-1 表示文件读完，不等于-1 表示读取到数据了
            StringBuilder stringBuilder=new StringBuilder();

            try {
                //从文件里面读取，存入到字节数组中，再由字节数组构造String 输出
               while( (len=inputStream.read(arrayb))!=-1){
//                   字节数组构造String
                  stringBuilder.append(new String(arrayb));

               }
               System.out.println(stringBuilder.toString());
               inputStream.close();
                ;

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args){
        try {
            ByteOutStreamDemo.out();
//            ByteOutStreamDemo.in();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(din);
    }
}
