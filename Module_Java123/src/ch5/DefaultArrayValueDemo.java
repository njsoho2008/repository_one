package ch5;

public class DefaultArrayValueDemo {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        double[] doubleArray = new double[10];
        char[] charArray = new char[10];
        boolean[] booleanArray = new boolean[10];
        System.out.println("intArray的默认值");
        for (int i = 0; i < intArray.length; i++) {

            System.out.println("intArray["+i+"]=" + intArray[i]+" ");
        }
        System.out.println("doubleArray的默认值");
        for (int i = 0; i < doubleArray.length; i++) {

            System.out.println("doubleArray["+i+"]=" + doubleArray[i]+" ");
        }
        System.out.println("charArray的默认值");
        for (int i = 0; i < charArray.length; i++) {

            System.out.println("charArray["+i+"]=" + charArray[i]+" ");
        }

        System.out.println("booleanArray的默认值");
        for (int i = 0; i < booleanArray.length; i++) {

            System.out.println("booleanArray["+i+"]=" + booleanArray[i]+" ");
        }


    }
}
