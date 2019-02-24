package cn.edu.javaprogram_edition10;

import java.util.Scanner;

public class ComputerTax {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int stauts=input.nextInt();
        double income=input.nextDouble();
        double tax_out=0.0;
        switch (stauts){
            case  0:
                if(income<=8350){
                    tax_out=income*0.1;

                }else if(income>8350&& income<33950){
                    tax_out=(income-8350)*0.15+8350*0.1;

                }else if(income<82251){
                    tax_out=8350*0.1+(33950-8530)*0.15+(income-33950)*0.25;

                }else if(income<171550){
                    tax_out=8350*0.1+(33950-8530)*0.15+(82251-33950)*0.25+(income-82251)*0.28;

                }else  if(income<372950){
                    tax_out=8350*0.1+(33950-8530)*0.15+(82251-33950)*0.25+(171550-82251)*0.28+(income-171551)*0.33;
                }else {
                    tax_out=8350*0.1+(33950-8530)*0.15+(82251-33950)*0.25+(171550-82251)*0.28+(372950-171551)*0.33+(income-372951)*0.35;
                }
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:

                break;

            default:
                System.out.println("输入的数字可能非法有误！");
//               System.exit(1);




        }
        System.out.println("您需要缴纳的联邦税为："+tax_out);



    }
}
