package cn.edu.niit.codingke.ch2;

public class ForDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int t=1;
        int m=0;

        m=++t;
        m=m++;

        System.out.println(m);
        m++;

        System.out.println(m);
    }
}
