package ch6;
//线程安全的
public class MyStringBufferDemo {

    public static void main(String[] args) {
        String a = "wa";//常量"wa"
        String b = "wb"; //常量"wb"
        String aa="wa";
        System.out.println("a==aa? "+(a==aa));

//        为了求得c的值，会产生5个内存对象:  wa 、wb、  qq、 wawb 、 wawbqq 一共5个即a b qq a+b a+b+qq
        String c = a + b + "qq"; //C=变量a+变量b+1

        System.out.println("c="+c);
        String c1=new String(a);
        String c2=new String("wa");
        String c3=new String(aa);
        System.out.println("c1="+c1);
        System.out.println("c2="+c2);

        System.out.println("a==c2??  "+(a==c2));

        System.out.println("c1==c2?   "+(c1==c2));

        System.out.println("c1==c3?   "+(c1==c3));



        String d = "a" + "b" + 1 + 2 + 4;//一个对象，因为都是常量，在编译期就确定了

        // 在Java中字符串的常量和变量的混合运算，建议使用StringBuffer，避免在编译期产生很多垃圾对象，
        //StringBuffer是通过字符数组的动态扩充，默认的数字长度为16；因此超过16的数组大小以后，以原来数组的
        //2倍+2的幅度扩充，因此如果事先知道要填充的长度的话，可以采用
        // StringBuffer的构造函数,StringBuffer(int capacity),来避免过度自动扩充的次数，以此提高效率
        //StringBuffer是线程安全的，性能因此略低
        StringBuffer sb = new StringBuffer();
        sb.append("a");
        sb.append("b");
        sb.append(21182);
        sb.append("d").append("rrere").append(4.999);
        System.out.println(sb.toString());
        System.out.println();
    }
}
