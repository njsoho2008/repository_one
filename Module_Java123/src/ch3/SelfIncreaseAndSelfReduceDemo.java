package ch3;

public class SelfIncreaseAndSelfReduceDemo {
    public static void main(String[] args){
        int i=1;
        int j;
        System.out.println("J的值："+(j=++i)+";"+"I的值："+i);
        System.out.println("J的值："+(j=i++)+";"+"I的值："+i);
        System.out.println("J的值："+(j=--i)+";"+"I的值："+i);
        System.out.println("J的值："+(j=i--)+";"+"I的值："+i);


    }
}
