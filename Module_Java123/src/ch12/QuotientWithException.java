package ch12;

import java.util.Scanner;

public class QuotientWithException {
    public static int quotient(int num1, int num2)  {
       if (num2 == 0) {
            throw new ArithmeticException("除数不能为零");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        try {
            int dl = QuotientWithException.quotient(n1, n2);
            System.out.println("计算结果dl=" + dl);
        } catch (ArithmeticException e) {

            System.out.println("can not divided byte zero");
            System.out.println("please input a new number.... ");

            n2=input.nextInt();
            int dl = QuotientWithException.quotient(n1, n2);
            System.out.println("计算结果dl=" + dl);

        }finally {
            System.out.println("continue.......");
        }



    }
}
