package cn.edu.javaprogram_edition10;

public class F {
    private  int x=0;
    private  int y=0;
    public  F(){}
    public  void  p(){
        int x=-1;
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
    public static  void main(String[] args){
        F f=new F();
        f.p();
    }
}
