package ch5;

public class PassByValueThreeDemo {
    public static void  main(String[] args){
        int times=3;
        System.out.println("调用之前，变量times的值："+times);
         nPrintln("welcome to Java",times);
        System.out.println("调用之后，变量times的值："+times);

    }

    public static void  nPrintln(String message,int n){
        while (n>0){
            System.out.println("n="+n);
            System.out.println(message);
            n--;
        }


    }
}
