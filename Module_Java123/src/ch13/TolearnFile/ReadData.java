package ch13.TolearnFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args){
        File file=new File("c:/scores.txt");
        if(file.exists()){
            System.out.println("scores.txt is exists");
//            System.exit(1);
        }else {
            try {
                file.createNewFile();
                //给文件重命名
               File file1=new File(file.getParentFile(),"my_myscores.txt");
               file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
//            从一个文件中读取数据 来创建input
            Scanner input=new Scanner(file);

            while(input.hasNext()){
                String firstname=input.next();
                String  midname= input.next();
                String lastName=input.next();
//               int score=input.nextInt();


                System.out.println(firstname+" "+midname+" "+lastName+" "+"");
            }
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
