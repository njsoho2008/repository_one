package ch3;



import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
       /* System.out.println("请输入字节：");
        byte byteValue=input.nextByte();
        System.out.println();
        System.out.println("请输入短的整形数：");
        short shortValue=input.nextShort();*/

        System.out.println("请输入一个整数，表示时间秒");
        int seconds=input.nextInt();
        int minutes=seconds/60;
        int remainingSeconds=seconds%60;
        System.out.println("现在是"+minutes+"分"+remainingSeconds+"秒");



    }
}
