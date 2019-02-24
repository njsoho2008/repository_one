package ch4;

import java.util.Scanner;

public class Random_if_Dmeo {
    public static void main(String[] args){
          //产生2个随机数
        int i1=(int)(Math.random()*10);
        int i2=(int)(Math.random()*10);

        if(i1<i2){
            int temp=i1;
            i1=i2;
            i2=temp;

        }

        System.out.print(i1+"-"+i2+"="+"?");
        Scanner input=new Scanner(System.in);
        int answer=input.nextInt();
        if(i1-i2==answer){
            System.out.print("你的答案是正确的");
        }else{
            System.out.println("请重新输入一个结果...");
            answer=input.nextInt();
            System.out.print(i1+"-"+i2+"="+(i1-i2));
        }
    }
}
