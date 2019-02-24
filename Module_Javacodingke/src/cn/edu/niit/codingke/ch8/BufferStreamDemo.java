package cn.edu.niit.codingke.ch8;

import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Scanner;

public class BufferStreamDemo {
    //字节读操作
    public static void bufferedIn(){
        File file=new File("c:\\test\\my\\first.txt");
        try {
            InputStream in=new FileInputStream(file);
            BufferedInputStream bin=new BufferedInputStream(in);
            byte[] bytes=new byte[1024*5];
            int len=-1;
            try {
                StringBuilder sb=new StringBuilder();

                while ((len=bin.read(bytes))!=-1){
                    sb.append(new String(bytes));

                }
                System.out.println(sb.toString());
                bin.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

//        字符读操作
        public static  void bufferedCharReader(File f){
            try {
                FileReader fd=new FileReader(f);
                BufferedReader brd=new BufferedReader(fd);
                char[] chars=new char[1024*10];
                int len=-1;
                try {
                    StringBuilder sb=new StringBuilder();

                    while ((len=brd.read(chars))!=-1){
                       sb.append(chars);
                    }
                    System.out.println(sb.toString());
                    brd.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }


        }




public static void bufferedWrite(File tofile){
    try {
        OutputStream out=new FileOutputStream(tofile,true);
        BufferedOutputStream bout=new BufferedOutputStream(out);
        String str="小桥流水人家，古道西风廋马 \r\n";
        try {
            bout.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }

}


public  static void bufferedCharWriter(File file, Scanner scanner){
    try {
        FileWriter fw=new FileWriter(file,true);
        BufferedWriter bufferedWriter=new BufferedWriter(fw);
        bufferedWriter.write(scanner.next());
        bufferedWriter.close();
        fw.close();
    } catch (IOException e) {
        e.printStackTrace();
    }

}
public  static void main(String[] args){
      //  bufferedIn();
        File file=new File("c:\\test\\my\\wrfile.txt");
        //bufferedWrite(file);
    Scanner scanner=new Scanner(System.in);
    bufferedCharWriter(file,scanner);

}

}
