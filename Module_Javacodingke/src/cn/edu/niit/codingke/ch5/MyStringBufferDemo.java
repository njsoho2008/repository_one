package cn.edu.niit.codingke.ch5;

public class MyStringBufferDemo {

    public static void main(String[] args){
         String a="a";//常量"a"
         String b="b"; //常量"b"
         String c=a+b+"qq"; //C=变量a+变量b+1
        System.out.println(c);
        //以上会有5个对象在内存中
        String d="a"+"b"+1+2+4;//一个对象
       // 在Java中字符串的常量和变量的混合运算，建议使用StringBuffer，避免在编译期产生很多垃圾对象，
        //StringBuffer是通过字符数组的动态扩充，默认的数字长度为16；因此超过16的数组大小以后，以原来数组的
        //2倍+2的幅度扩充，因此如果事先知道要填充的长度的话，可以采用
       // StringBuffer的构造函数,StringBuffer(int capacity),来避免过度自动扩充的次数，以此提高效率
        //StringBuffer是线程安全的，性能因此略低
         StringBuffer sb=new StringBuffer();
         sb.append("a");
         sb.append("b");
         sb.append(21182);
         sb.append("d").append("rrere").append(4.999);
         System.out.println(sb.toString());
         System.out.println();
    }
}
