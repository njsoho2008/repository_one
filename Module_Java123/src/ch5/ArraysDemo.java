package ch5;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        double[] numbers = {6.0, 5.9, 8.8, 9.9, 11, 99, 45, 8};
        Arrays.sort(numbers);
        for (double d : numbers
                ) {
            System.out.print(d + " ");
        }
        double[] num2 = Arrays.copyOf(numbers, numbers.length * 2);
        System.out.println();
        for (double d : num2
                ) {
            System.out.print(d + " ");
        }


    }
}
