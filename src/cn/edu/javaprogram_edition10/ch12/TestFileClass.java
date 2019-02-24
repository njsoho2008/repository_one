package cn.edu.javaprogram_edition10.ch12;

import java.io.File;

public class TestFileClass {

    public static void main(String[] args){
ManageFile();

    }
    public static void ManageFile(){
        File file=new File("c://npkoalii_vs_acx_njcb.js");
        System.out.println("Does it exist?  "+file.exists());

    }
   public static  void  prtProperties(File file){
        System.out.println("文件是否存在？"+(file.exists()? "存在":"不存在"));
        System.out.println("文件的长度是："+file.length()+"字节");
        System.out.println();
   }
}
