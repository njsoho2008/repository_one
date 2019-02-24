package cn.edu.niit.codingke.ch8;
//在指定的目录下查找相应的文件

import java.io.File;

public class FileDemo2 {
    public  static void main(String[] args){
        FileDemo2.findFile(new File("D:\\PDF"),".pdf");

    }
    public static void findFile(File file, String ext){
        if (file==null) return;
        if (file.isDirectory()){
            File[] files1=file.listFiles();
            for(File f:files1){
                findFile(f,ext);//递归调用
            }
        }else {
//            File[] files2=file.listFiles();
////            System.out.println(Arrays.toString(files2));
//            System.out.println(files2.length);

              String name=file.getName();
              if(name.endsWith(ext)) {
                  System.out.println(name);
              }
        }
    }
}
