package ch5;

//方法的定义与值传递
public class PassByValueDemo {

    public static void main(String[] args) {
        int i = 1;
        int j = 4;
        PassByValueDemo.swap(i, j);
        System.out.print("i=" + i + " " + "j=" + j);

    }

    public static void swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("\n在交换之后，a=" + a + "以及b=" + b);
    }

}
