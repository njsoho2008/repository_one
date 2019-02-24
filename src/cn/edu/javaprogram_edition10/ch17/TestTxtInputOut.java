package cn.edu.javaprogram_edition10.ch17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestTxtInputOut {
    public static  void main(String[] args){
         File file=new File("temp.txt");

        try {

            PrintWriter output=new PrintWriter("temp.txt");
            output.print("Java Programe");
            output.close();
            Scanner input=new Scanner(file);
            System.out.println(input.nextLine());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {


        }

    }
}
