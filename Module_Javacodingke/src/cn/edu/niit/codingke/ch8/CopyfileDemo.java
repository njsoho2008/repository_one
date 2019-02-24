package cn.edu.niit.codingke.ch8;

import java.io.*;

public class CopyfileDemo {
    public static void main(String[] args){
        File freadfrom=new File("c:\\test\\my\\first.txt");
        File fwriteto=new File("c:\\test\\my\\wrfile.txt");
        copyfile(freadfrom,fwriteto);

    }
    private static void  copyfile(File src,File target){
        try {
            FileInputStream fin=new FileInputStream(src);
            FileOutputStream fout=new FileOutputStream(target,true);
            byte[] bytes=new byte[1024*1];
            try {
                int len=-1;
                while ((len=fin.read(bytes))!=-1){
                    fout.write(bytes,0,len);
                }
                 if(fin!=null){
                    fin.close();
                 }
                 if (fout!=null)
                 {
                     fout.close();
                 }
            } catch (IOException e) {
                e.printStackTrace();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {

        }

    }
}
