package cn.edu.niit.codingke.ch5;

/**
 * Created by Administrator on 2017-8-14.
 *
 * 堆  与 常量值
 */
public class MyStringDemo {
    public static void main(String[] arg){
       String str1="Hello,Good Morning!";//创建于常量池中
       String str2=new String("Hello,Good Morning!");
       String str3="Hello,Good Morning!";
       System.out.println(str1==str2);
       boolean t=str1.equals(str2);
       System.out.println(t);
       if(str1.hashCode()==str2.hashCode()){
           System.out.println("Str1和Str2的hash值相等");
       }else {
           System.out.println("Str1和Str2的hash值不相等");
       }
        if(str1.hashCode()==str3.hashCode()){
            System.out.println("Str1和Str3的hash值相等");
        }else {
            System.out.println("Str1和Str3的hash值不相等");
        }
        System.out.println("----------------------------------");
        System.out.println("比较编译期和运行期的不同");
        String a="a";
        String a1=a+1;
        String a2="a1";
       System.out.println("a1==a2?:"+(a1==a2));
        final String b="b";
        String b1=b+1;
        String b2="b1";
        System.out.println("b1==b2?:"+(b1==b2));

        String c=getC();
        String c1=c+1;
        String c2="c1";
        System.out.println("c1==c2?:"+(c1==c2));

        final  String d=getD();
        String d1=d+1;
        String d2="d1";
        System.out.println("d1==d2?:"+(d1==d2));

    }
    private static String getC(){
        return  "c";
    }
    private static String getD(){
        return  "d";
    }
}
