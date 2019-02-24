package ch8.homework;

import java.util.Scanner;

public class LinearEquation {
    private int a,b,c,d,e,f;
    public LinearEquation(){}

    public LinearEquation(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public int getA() {

        return a;

    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public int getE() {
        return e;
    }

    public int getF() {
        return f;
    }

    public boolean isSolvable(){
        boolean b=false;
        if((this.a*this.d-this.b*this.c)==0){
            System.out.println("The equation has no solution");
        }
        else {
            b=true;
        }

        return  b;
    }
    public double getX(){
        double xvalue;
        xvalue=(this.e*this.d-this.b*this.f)/(a*d-b*c );
        return  xvalue;
    }

    public double getY(){
        double yvalue;
        yvalue=(a*f-e*c)/(a*d-b*c);
        return  yvalue;
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
    /*    LinearEquation linearEquation=new LinearEquation();

        linearEquation.a=input.nextInt();
        linearEquation.b=input.nextInt();
        linearEquation.c=input.nextInt();
        linearEquation.d=input.nextInt();
        linearEquation.e=input.nextInt();
        linearEquation.f=input.nextInt();

       if(linearEquation.isSolvable()==true){
           System.out.println("此方程的解x="+linearEquation.getX()+"\n 此方程的解y="+linearEquation.getY());
       }*/
//       方法二 ，通过有参数的构造函数
       int a=input.nextInt();
       int b=input.nextInt();
       int c=input.nextInt();
       int d=input.nextInt();
       int e=input.nextInt();
       int f=input.nextInt();
       LinearEquation linearEquation_2=new LinearEquation(a,b,c,d,e,f);
       if (linearEquation_2.isSolvable()==true){
           System.out.println("此方程的解x="+linearEquation_2.getX()+
                   "\n 此方程的解y="+linearEquation_2.getY());
       }
       }





    }


