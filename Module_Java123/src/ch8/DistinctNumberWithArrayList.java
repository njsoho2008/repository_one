package ch8;
//接纳不同的数字，以0作为结束符号
import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumberWithArrayList {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        System.out.println("输入一些整数值，以0为结束标志");
        int value;
        do{
            value=input.nextInt();
            if(!list.contains(value)&&value!=0){
                list.add(value);
            }

        }while (value!=0);

        for (int i=0;i<list.size();i++) {
         System.out.print(list.get(i)+" ");
        }
    }
}
