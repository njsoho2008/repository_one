package ch3;

import java.util.Scanner;

//三目运算符
public class sanmuOperatorDemo {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("请输入a的值：");
        int a=input.nextInt();
        System.out.println("请输入b的值：");
        int b=input.nextInt();
        System.out.println("输出其中的最大值："+ (a>b?a:b));
    }
}
