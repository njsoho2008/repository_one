package ch13.TolearnFile;

import java.io.File;
import java.util.Date;

//要在当前目录下进行测试，IJ环境不行
public class TestFile {
    public static void Tfile(){
        File file=new File("/ch13/image/example_01.jpg");
        File file1=new File("C:/333/dir2");
        file1.mkdir();
        System.out.println("文件存在吗？"+(file.exists()?"存在":"不存在"));
        System.out.println("file 的绝对路径是："+file.getAbsolutePath());
        System.out.println("file1 is file?"+ file1.isDirectory());
        System.out.println("file is file?"+ file.isFile());
//        是绝对路径创建的吗
        System.out.println("file is absolute?"+file.isAbsolute());

        System.out.println("last modified on"+new Date(file.lastModified()));
        System.out.println("today  is " +new Date());
    }

    public static void main(String[] args){
        Tfile();
    }
}
