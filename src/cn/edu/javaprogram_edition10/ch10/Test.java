package cn.edu.javaprogram_edition10.ch10;

public class Test {

    public static void main(String[] args) {
        String s1 = "WelCome to Java";
        String s2 = s1;
        String s3 = new String("WelCome to Java");
        String s4 = "WelCome to Java";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println("*************");
        System.out.println("Hi,ABC,Good".matches(".*ABC.*"));
        System.out.println("Hi,ABC,Good".matches("ABC"));
        System.out.println("Hi,ABC,Good".matches("Hi.*"));
        System.out.println("A,;B;C".replaceAll(",;", "##"));
        System.out.println("A,B;C".replaceAll("[,;]", "##"));
        System.out.println("比较 String构造函数和StringBuilder构造函数创建的默认字符串的长度");
        String s = new String();
        System.out.println(s.length());
        ;
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.setLength(8);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.setLength(38);
        System.out.println(sb.length());
        System.out.println(sb.capacity());

    }
}
