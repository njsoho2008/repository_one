package ch4;

//判断输入的字母是否是大写字母

import java.util.Scanner;

public class IfDemoASCII {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

       int alpha=input.nextInt();

        if(alpha>=65&& alpha<=90)
            System.out.println("此为大写字母:"+(char) alpha);
        else if(alpha>=97&&alpha<=122){

            System.out.println("此为小写字母:"+(char) alpha);
        }else{
            System.out.println("alpha="+alpha);



        }
//从键盘输入字符
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = s.charAt(0);
        System.out.println("刚才输入的字符是:"+c+"对应的ASCII码的十进制值是："+(int)c);

    }
}
