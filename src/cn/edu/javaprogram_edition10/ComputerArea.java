package cn.edu.javaprogram_edition10;

import java.util.Scanner;

public class ComputerArea {

    private String name;

    public  static  void main(String[] args){

        Scanner input=new Scanner(System.in);
        double radius=input.nextDouble();
        double area=Math.pow(radius,2)*3.1415926;
        System.out.println("圆的面积是："+area);

        byte b=65;
        System.out.println(b);
     System.out.println(System.getProperties());
     System.out.println(System.currentTimeMillis());
     System.out.println("------------------------------------");
        int i=1,j;
//       j=++i;
//       System.out.println(j);
        j=i++;
        System.out.println("j="+j);
        System.out.println("i="+i);
        j=--i;
        System.out.println("i="+i);
        System.out.println("j="+j);
        j=i--;
        System.out.println("j="+j);
        System.out.println("i="+i);

//        Scanner input=new Scanner(System.in);
        double x=input.nextDouble();
        System.out.println(Math.ceil(x));
    }





}
