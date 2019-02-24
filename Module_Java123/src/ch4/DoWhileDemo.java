package ch4;

import java.util.Scanner;

public class DoWhileDemo {
    public static  void main(String[] args){
        int i=0;
        do{
            System.out.println("i="+i++);
        }while (i<10);

      //使用标记值来控制循环
        Scanner input= new Scanner(System.in);
        int data=input.nextInt();
        int sum=0;
        while (data!=0){
            sum+=data;
            data=input.nextInt();
        }
        System.out.println("sum="+sum);

    }

}
