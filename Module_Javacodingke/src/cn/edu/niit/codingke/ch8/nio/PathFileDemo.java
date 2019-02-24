package cn.edu.niit.codingke.ch8.nio;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.*;
import java.util.List;

/**
 * JDK1.7之后的文件操作类
 *   path接口
 *   paths类
 *   files类
 *
 */


public class PathFileDemo {

    public  static void main(String[] args){
        File file=new File("c:\\test\\first.doc");
        Path p1= Paths.get("c:\\test\\","first.doc");
        Path p2=file.toPath();
        Path p3= FileSystems.getDefault().getPath("c:\\test\\","first.doc");

        Path p4=Paths.get("c:\\test\\wrfile.txt");
       System.out.println(p1.toString()+p2.toString()+p3.toString()+p4.toString());
        String str="今天是中国人民共和国国庆的第二天！";
//写操作
        try {
            Files.write(p4,str.getBytes("UTF-8"),StandardOpenOption.APPEND);

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        读操作
        try {
         byte[] bytes=Files.readAllBytes(p4);
        System.out.println(new String(bytes));



        } catch (IOException e) {
            e.printStackTrace();
        }
//        copy & move
//        try {
////            Files.copy(p4,Paths.get("d:\\wrfile.txt"),StandardCopyOption.REPLACE_EXISTING);
////            Files.move(p4,Paths.get("e:\\wrfile-e.txt"),StandardCopyOption.REPLACE_EXISTING);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//删除文件
//        try {
//            Files.deleteIfExists(p3);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        创建目录
        Path p=Paths.get("d:\\xx\\xx");
        try {
            Files.createDirectories(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //创建文件
        try {
            Files.createFile(Paths.get("d:\\xx\\qq.pdf"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
