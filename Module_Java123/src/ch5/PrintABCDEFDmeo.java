package ch5;

public class PrintABCDEFDmeo {
    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int charslen = chars.length;
        for (int i = 0; i < charslen; i++) {
            for (int k = 0; k <charslen - i; k++) {
                System.out.print(" ");

            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(chars[i]);
            }
            System.out.println();
        }
    }
}
