package cn.edu.niit.scs.JavaLastTest;

import java.util.Scanner;

public class ArrayDemo {

    public static void forloopprint(int[] a) {
        int len = a.length;
        for (int i = 0; i < len; i++) {

            System.out.println("a[" + i + "]=" + a[i]);

        }

    }

    public static int arraysum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];

        }

        System.out.println("sum=" + sum);
        return sum;

    }


    public static void match(int[] a, int num) {
        for (int i = 0; i < a.length; i++) {
            if (num == a[i]) {
                System.out.println("There has a number in Array");
            }
        }

    }

    public static void main(String[] args) {
        int[] a = {16, 14, 21, 11, 23, 34, 12};
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        forloopprint(a);
        arraysum(a);
        match(a, 11);

    }


}
