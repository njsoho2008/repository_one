package cn.edu.niit.scs.JavaLastTest;

public class SwapDemo {
    public static void swap(int a,int b){
        int c;
        c=a;
        a=b;
        b=c;
       System.out.println("swap in swap method a="+a+"b="+b);

    }

    public static void main(String[] args){
        int a=10,b=12;
        SwapDemo.swap(10,12);
        System.out.println("after swap a="+a+" "+"b="+b);
    }

}
