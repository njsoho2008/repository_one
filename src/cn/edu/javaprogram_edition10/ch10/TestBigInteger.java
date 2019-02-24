package cn.edu.javaprogram_edition10.ch10;

import java.math.BigInteger;
//大数据的计算，BigInteger内封装了加减乘除法
public class TestBigInteger {
    public static void main(String[] args){
        System.out.println("计算阶乘"+""+factorial(10));
    }
    public static BigInteger factorial(int n){
        BigInteger result=BigInteger.ONE;
        for(int i=1;i<=n;i++){
            result=result.multiply(new BigInteger(i+""));
        }
//        int  i=Integer.MAX_VALUE;
        return  result;

    }
}
