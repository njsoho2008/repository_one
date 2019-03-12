
package ch13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
//要在当前目录下进行测试，IJ环境不行

public class WriteData {
    public static void writedata(){
        File file=new File("scores.txt");
        if(file.exists()){
            System.out.println("file is already exists");
            System.exit(1);
        }else{
            try {
                file.createNewFile();
                System.out.println("现场当即创建‘scores.txt’");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("创建scores.txt");
            }


        }
        try {
//            如果scores.txt不存在，则会创建这个文件，并且向文本文件内写入内容
//            在命令行模式下运行

            PrintWriter output=new PrintWriter(file);
            output.print("Johe T Smith");
            output.print(90);
            output.print("Eric K Jones");
            output.print(85);
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        writedata();
    }
}
