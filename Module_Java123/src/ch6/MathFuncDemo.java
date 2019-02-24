package ch6;

public class MathFuncDemo {
    public static void main(String[] args){
        System.out.println(Math.ceil(2.1));//向上取整，返回一个双精度的值
        System.out.println(Math.ceil(-2.1));
        System.out.println(Math.floor(2.1));
        System.out.println(Math.floor(-2.1));
        System.out.println(Math.rint(2.1));//取整为最靠近他的数
        System.out.println(Math.rint(-2.0));
        System.out.println(Math.rint(-2.1));
        System.out.println(Math.rint(-2.4));
        System.out.println(Math.rint(-2.9));
        System.out.println(Math.round(5.8));
        System.out.println(Math.round(5.4));
        System.out.println(Math.pow(5,4));
        System.out.println(Math.max(5,4));
        System.out.println(Math.min(5,4));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.exp(9));//返回e的9次方
        System.out.println(Math.log10(10));//对数的物理意义？
        System.out.println(Math.log(Math.E));//返回e的自然底数
        System.out.println(Math.log(99));//返回99的自然底数

        //弧度 与角度的关系
     //   弧度＝度×π/180
       /*
        90°＝90×π/180 ＝π/2 弧度
        60°＝60×π/180 ＝π/3 弧度
        */
        System.out.println(Math.toDegrees(90)); //转角度
        System.out.println(Math.toRadians(90)); //转弧度




    }
}
