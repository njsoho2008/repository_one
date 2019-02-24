package cn.edu.niit.codingke.ch8;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class FileDemo {
    public static void main(String[] args){
//        File 表示一个文件或者文件目录
        File file=new File("D:\\"+File.separator+"IdeaProjects"+File.separator+"cn"+
        File.separator+"edu"+File.separator+"niit"+File.separator+"ch8"+File.separator+"test.txt");
        System.out.println(file.getPath());
//        if(!file.exists()){
//            try {
//                file.createNewFile();
//                System.out.println("创建成功");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            System.out.println(file.isDirectory());
//            System.out.println(file.isFile());
//
//        }
        File file1=new File("D:\\EX");
        System.out.println(file1.getPath());
        String[] names=file1.list();

        System.out.println(Arrays.toString(names));
//        刷选出符合要求的文件
       File[] files= file1.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
              return   pathname.getName().endsWith(".xlsx");

            }
        });
        System.out.println("---经过筛选的文件如下："+Arrays.toString(files));

//复习使用lamda表达式

        File[] files2=file1.listFiles((pathname)->pathname.getName().endsWith(".xls"));
        System.out.println("---经过筛选的文件如下："+Arrays.toString(files2));
        System.out.println();
      System.out.println("*********************************************");
      System.out.println();
        File[] fileslist=file1.listFiles();
        for (File f:fileslist){
            System.out.println("文件的长度："+f.length());
            System.out.println("文件的名字"+f.getName());
            System.out.println("文件的路径"+f.getPath());
            System.out.println("文件的绝对路径"+f.getAbsolutePath());
            System.out.println("文件是否隐藏属性"+f.isHidden());
            System.out.println("文件的空间"+f.getTotalSpace());

            Date d=new Date(f.lastModified());
            DateFormat df=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

            System.out.println("文件的最后的修改时间"+df.format(d));
            System.out.println("-------------------------------");
        }
        File file2=new File("test.txt");
        System.out.println("文件的相对路径："+file2.getPath());
        System.out.println("文件的绝对路径："+file2.getAbsolutePath());

//        创建文件夹
        File file3=new File("c:\\test\\my");
        file3.mkdirs();
        System.out.println(file3.getAbsolutePath());
       file3.renameTo(new File("c:\\my"));
       file3.mkdir();
        file3.renameTo(new File("c:\\my\\newfolder"));
        file3.mkdirs();
        try {
            boolean newFile = file3.createNewFile();
            System.out.println("新的文件file3已经创建");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(file3.getAbsolutePath());
    }
}
