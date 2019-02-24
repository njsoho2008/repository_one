package ch6;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random myrandmo = new Random(3);
        for (int i = 0; i < 15; i++) {
            System.out.print(myrandmo.nextInt(40) + " ");

        }
        System.out.println();
       System.out.println(myrandmo.nextDouble());
        System.out.println(myrandmo.nextInt(40));
        System.out.println(myrandmo.nextFloat());



    }
}
