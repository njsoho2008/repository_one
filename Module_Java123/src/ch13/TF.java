package ch13;

import java.io.File;

public class TF {
    public static void Tfile(){
        File file=new File("image/example_01.jpg");
        File file1=new File("C:/333/2.jpg");
        file1.mkdir();
		file1.mkdirs();
        System.out.println("Does it exist?"+(file.exists()?"yes":"no"));
        System.out.println(file.getAbsolutePath());
    }

    public static void main(String[] args){
        Tfile();
    }
}