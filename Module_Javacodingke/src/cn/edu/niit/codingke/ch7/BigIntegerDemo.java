package cn.edu.niit.codingke.ch7;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Arrays;

public class BigIntegerDemo {
    public static void main(String[] args){
        String v1="9523462757257477";
        String v2="6578687967998977";
        BigInteger b1=new BigInteger(v1);
        BigInteger b2=new BigInteger(v2);



        System.out.println(b1.add(b2));
        System.out.println(b1.subtract(b2));
        System.out.println(b1.multiply(b2));
        System.out.println(b1.divide(b2));

        System.out.println(b1.remainder(b2));//取余运算
        System.out.println(Arrays.toString(b1.divideAndRemainder(b2)));//返回除法的结果和余

        String v3="3334.6745674576574674";
        String v4="56.7656748745687457845";
        BigDecimal b3=new BigDecimal(v3);
        BigDecimal b4=new BigDecimal(v4);

        System.out.println(b3.add(b4));
        System.out.println(b3.subtract(b4));
        System.out.println(b3.multiply(b4));
        try

        {
          //  System.out.println(b3.divide(b4));

        }catch (ArithmeticException e){
            e.printStackTrace();//除不尽的问题
        }finally{
            System.out.println(b3.scale()-(b4.scale()));
        }

        Double pi=3.1415926;
        System.out.println(new DecimalFormat("0").format(pi));
        System.out.println(new DecimalFormat("0.00").format(pi));
        System.out.println(new DecimalFormat("0.000").format(pi));
        Double d=4444.4444233243;
        System.out.println(new DecimalFormat("#").format(d));
        System.out.println(new DecimalFormat("#.##%").format(d));

    }

}
