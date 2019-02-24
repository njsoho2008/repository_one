package ch6;

import java.util.Scanner;

public class InputCharDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str5 = input.nextLine();
        for (int i = 0; i < str5.length(); i++) {
            char ch1 = str5.charAt(i);
            System.out.print(ch1 + " ");

        }
        System.out.println();
        String strx = "Hello,Good morning";
        char[] charsa = new char[strx.length()];
        charsa = strx.toCharArray();
        System.out.println("数组的首地址："+charsa.toString());
        for (int i = 0; i < strx.length(); i++) {

            System.out.print(charsa[i] + " ");
        }

    }
}
