package cn.edu.niit.codingke.ch8;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamDemo {

    public  static  void merge(File f1, File f2, File fileOne){


        try {
            InputStream in1=new FileInputStream(f1);
            InputStream in2=new FileInputStream(f2);
            OutputStream out=new FileOutputStream(fileOne,true);
            Vector<InputStream> v=new Vector<InputStream>();
            v.add(in1);
            v.add(in2);
            Enumeration es=v.elements();


           SequenceInputStream sis=new SequenceInputStream(es);
           int len=-1;
           byte[] bytes=new byte[1024*10];
           while ((len=sis.read(bytes))!=-1){
               out.write(bytes,0,len);
               out.flush();
           }
           out.close();
           in1.close();
           in2.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args){

        File file3=new File("c:\\test\\my\\昂科威车型手册.pdf");
        System.out.println(file3.getName());
        File file4=new File("c:\\test\\my\\wrfile.txt");
        File file5=new File("c:\\test\\my\\考场对应批次时间表.pdf");

        String fileName=file3.getName();
        String prefix=fileName.substring(fileName.lastIndexOf(".")+1);

        File file=new File("c:\\test\\my\\"+"haohao"+"."+prefix);
        merge(file5,file5,file);
    }
}
