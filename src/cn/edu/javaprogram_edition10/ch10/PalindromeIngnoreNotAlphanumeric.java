package cn.edu.javaprogram_edition10.ch10;

import java.util.Scanner;

public class PalindromeIngnoreNotAlphanumeric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入字符串");
        String s = input.nextLine();
        System.out.print("忽略非字母，又非数字的字符，\n " + s + "是回文字符串吗? " + (isPalindrome(s) ? "是的" : "不是的"));
    }

    //判断是否为回文
    public static boolean isPalindrome(String s) {
        String s1 = filter(s);
        String s2 = reverse(s1);
        return s1.equals(s2);
    }

    public static String filter(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public static String reverse(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

}
