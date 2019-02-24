package ch6;

import java.util.Scanner;

public class InputStringDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //从控制台读取字符串
        String str = input.nextLine();//回车结束
        String str2 = input.next();//' ' '\t' '\f' '\r' '\n'  这些符号结束输入
        String str3 = input.next();
        String str4 = input.next();
        System.out.println(str);
        System.out.print(str2 + " " + str3 + " " + str4);


    }
}
