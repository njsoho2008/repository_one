package ch13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args){
        File file=new File("scores.txt");
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
