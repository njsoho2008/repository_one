package ch6;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Administrator on 2017-8-14.
 * <p>
 * 堆  与 常量值
 */
public class MyStringDemo {
    public static void main(String[] arg) {
        String str1 = "Hello,Good Morning!";//创建于常量池中，省内存
        String str2 = new String("Hello,Good Morning!"); //new 表示申请新的内存空间
        String str3 = "Hello,Good Morning!";
        System.out.println("str1 == str2相等吗？"+(str1 == str2));
        System.out.println("str1 == str3相等吗？"+(str1 == str3));
        boolean t = str1.equals(str2);
        System.out.println(t);  //内容相等吗？
        if (str1.hashCode() == str2.hashCode()) {
            System.out.println("Str1和Str2的hash值相等");
        } else {
            System.out.println("Str1和Str2的hash值不相等");
        }
        if (str1.hashCode() == str3.hashCode()) {
            System.out.println("Str1和Str3的hash值相等");
        } else {
            System.out.println("Str1和Str3的hash值不相等");
        }
//        HashSet hsets=new HashSet<String>();
//        hsets.add(str1);
//        hsets.add(str2);
//        hsets.add(str3);




        System.out.println("----------------------------------");
        System.out.println("比较编译期和运行期的不同");
//        直接赋值字符串时，考虑编译期和运行期的不同，如果编译期能确定，则使用已有的对象，如果不能，则运行期新建对象
        String a = "ab";  //编译期，创建于常量池中
        String a1 = a + 1;  //堆中新创建，编译期（javac MyStringDemo.java）a是变量，要运行时候（Java MyStringDemo）才能确定a1的值
        String a2 = "ab1";   //常量池中创建
        System.out.println("a1==a2?:" + (a1 == a2));
        final String b = "b"; //fianl 编译期创建
        String b1 = b + 1; //编译期被创建 常量池中的b+常量1 确定了b1,
        String b2 = "b1";  //b2直接从常量池中取,即b2直接指向常量池中的b1
        System.out.println("b1==b2?:" + (b1 == b2));

        String c = getC();//方法是运行期确定值
        String c1 = c + 1;
        String c2 = "c1";
        System.out.println("c1==c2?:" + (c1 == c2));

        final String d = getD();//方法是运行期确定值，final也没有用
        String d1 = d + 1;
        String d2 = "d1";
        System.out.println("d1==d2?:" + (d1 == d2));
    }
    private static String getC() {
        return "c";
    }
    private static String getD() {
        return "d";
    }
}
