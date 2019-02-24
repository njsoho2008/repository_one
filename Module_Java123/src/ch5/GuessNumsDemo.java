package ch5;

import java.util.Scanner;

public class GuessNumsDemo {
    public static void main(String[] args) {

        int[] nums = {43, 1, 22, 44, 49, 32};
        Scanner input = new Scanner(System.in);
        System.out.println("请输入50以内的整数：");
        int userNum = input.nextInt();
        boolean flag = false;//设置标记 编程技巧
        for (int k : nums
                ) {
            if (userNum == k) {//设计一个改错题
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("恭喜你才对了");
        } else {
            System.out.println("猜错了");
        }


    }
}
