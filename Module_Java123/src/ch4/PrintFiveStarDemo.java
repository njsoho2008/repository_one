package ch4;
//输出五角星图案
public class PrintFiveStarDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {

                System.out.print("*" + " ");

            }
            System.out.println();
        }

        System.out.print("--------------------\n");

        for (int i = 0; i < 5; i++) {

            for (int j = 5; j - i > 1; j--) {

                System.out.print(" ");

            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*" + "");
            }

            System.out.println();
        }

        System.out.print("--------------------\n");
        for (int i = 0; i < 5; i++) {

            for (int j = 5; j - i > 1; j--) {

                System.out.print(" ");

            }
            for (int k = 0; k < 2*i+1; k++) {
                System.out.print("^");
            }
            System.out.println();
        }


    }
}
