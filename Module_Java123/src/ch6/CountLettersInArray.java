package ch6;

/*
 * 统计一个数组中相同字母出现的次数
 *
 * */

import java.util.Scanner;

public class CountLettersInArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int total_number = input.nextInt();
        char[] chars = new char[total_number];
        chars = getCharsArray(total_number);

        int[] counts = new int[26];
//        counts = CountSameLetters(chars);
        counts=CountSameLetterTimes(chars);
        prtChars(counts);
    }

    //生成字符数组
    public static char[] getCharsArray(int amount) {
        char[] chars = new char[amount];
        for (int i = 0; i < amount; i++) {
            chars[i] = RandomCharacter.getRandomLowerCaseLetter();
        }
        return chars;
    }
//统计出现相同字符的次数 1
    public static int[] CountSameLetterTimes(char[] ch) {
        int[] sum = new int[26];

        for (int i = 0; i < ch.length; i++) {
            sum[ch[i] - 'a']++;
        }
        return sum;
    }
    //统计出现相同字符的次数 2
    public static int[] CountSameLetters(char[] ch) {
        int[] count = new int[26];
        for (int i = 97; i < 123; i++) {
            for (int j = 0; j < ch.length; j++) {
                if ((char)i == ch[j]) {
                    count[i-97]++;
                }

            }

        }
        return count;

    }

    public static void prtChars(int[] a) {
        for (int i = 97; i < 123; i++) {
            System.out.println((char) i + "出现的次数是 " + a[i - 97]);
        }
    }

}
