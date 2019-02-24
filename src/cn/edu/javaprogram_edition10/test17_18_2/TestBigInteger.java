package cn.edu.javaprogram_edition10.test17_18_2;
import java.math.*;
public class TestBigInteger{
    public static void main(String[] args){
        BigInteger x=new BigInteger("3");
        BigInteger y=new BigInteger("7");
        BigInteger z=x.add(y);
        System.out.println("x is"+ x);
        System.out.println("y is"+ y);
        System.out.println("z is"+ z);        
    }   
}