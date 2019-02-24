package cn.edu.niit.codingke.ch3;

public class methodCall {

    public static void main(String[] args){
        System.out.println(m(4,5));
        System.out.println(m(4,5.4));
        System.out.println(m(5.4,5.9));
    }
    public static double m(double x,double y){
        return  x+2;

    }
    public static double m(int t, double l){
        return  t+5;

    }
}
