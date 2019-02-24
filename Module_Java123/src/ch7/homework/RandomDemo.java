package ch7.homework;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        int[] arrayint = new int[50];

        Random random = new Random(1000000000);

        for (int i = 0; i < arrayint.length; i++) {
            arrayint[i] = random.nextInt(100);
        }


        for (int k : arrayint
                ) {
            System.out.print(k + " ");

        }
    }
}
