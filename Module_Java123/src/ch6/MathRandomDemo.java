package ch6;

public class MathRandomDemo {
    public static void main(String[] args){
        System.out.println((int)(Math.random()*10));//0-9之间的数
        System.out.println(50+(int)(Math.random()*50));//50--100之间的数
      System.out.println( getValueAtoB(10,20));

    }
    //
    public static int getValueAtoB(int a,int b){

        return  a+(int)(Math.random()*(b-a));

    }


}
