package ch6;

public class StringAddPrimer {
    public static void  main(String[] args){
        int a=5;
        int b=7;
        String str1="将数字拼接到字符串中："+a+b;

        System.out.println(str1);
        String str2=a+b+" 先做加法，后做字符串链接";
        System.out.println(str2);
        String str3=" a+b的计算结果是："+(a+b);
        System.out.println(str3);
        String str4="使用字符串将变量a和b分开"+a+" "+b;
        System.out.println(str4);
        String str5="输出布尔值"+(a>b);
        System.out.println(str5);

    }
}
