package cn.edu.niit.codingke.ch8;

import java.io.*;
import java.nio.charset.Charset;

import static java.nio.charset.Charset.*;

public class ByteToCharStreamDemo {
    //从字节转换成字符
    public static void reader(InputStream in){
        Reader rd=new InputStreamReader(in, Charset.forName("UTF-8"));
        char[] chars=new char[1024];
        int len=-1;
        try {
            StringBuilder sb=new StringBuilder();
            while ((len=rd.read(chars))!=-1){
                sb.append(chars);
            }
            System.out.println(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
//    从字节转换成字符

    public static void writer(OutputStream out,String str){

        Writer wt=new OutputStreamWriter(out,Charset.forName("UTF-8"));
        try {
            wt.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                wt.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args){
        File file=new File("c:\\test\\my\\first.txt");
        try {
            InputStream inputStream=new FileInputStream(file);
            reader(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        File file1=new File("c:\\test\\my\\wrfile.txt");
        try {
            OutputStream outputStream=new FileOutputStream(file1,true);
            writer(outputStream,"哗啦啦啦");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }
}
