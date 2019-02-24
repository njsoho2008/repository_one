package ch3;
//基本数据类型的转换
public class BasicTypeConversionDemo {

    public static void main(String[] args){
        byte b=127;
        short st=b;
        int i=st;
        System.out.println("byte b:"+b+"\n"+"short st:"+st+"\n"+"int i:"+ i);
        char ch='球';
        int hz=ch;
        System.out.println("char ch:"+ch+"\n"+"int hz:"+ch);
        float f=1.9f;
        double d=f;
        System.out.println("float f:"+f+"\n"+"double d："+d);
        int i2=(int)f;
        System.out.println("int i2:"+i2);
        //面试题

        st+=b;
        short st2=10;
        st2+=b;
        System.out.println("short st="+st2);
        long lon=9L;
        i2=i2+(int)lon;
        i2=(int)(i2+lon);
        System.out.println("i2="+i2);


    }
}
