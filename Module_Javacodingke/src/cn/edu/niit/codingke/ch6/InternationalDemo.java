package cn.edu.niit.codingke.ch6;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class InternationalDemo {
    public static void main(String[] args){
        //创建一个本地语言环境对象，该对象会根据参数设置，来选择与之相关的语言环境
        Locale locale_CN=new Locale("zh","CN");
        Locale locale_US=new Locale("en","US");
        String str=locale_CN.getCountry();
            String str2=locale_CN.getDisplayCountry();
            String str3=locale_CN.getDisplayLanguage();
            String str4=locale_CN.getDisplayName();
                    System.out.println(str4);
        Locale locale_info=Locale.getDefault();
        System.out.println(locale_info.getDisplayName());
        //强制使用英文环境
        ResourceBundle r1=ResourceBundle.getBundle("cn.edu.niit.ch6.local",locale_US);
       System.out.println(r1.getString("System.name"));
       //使用默认的环境
        ResourceBundle r2=ResourceBundle.getBundle("cn.edu.niit.ch6.local",locale_info);
        System.out.println(r2.getString("System.name"));
        Scanner input=new Scanner(System.in);
        ResourceBundle r3=ResourceBundle.getBundle("cn.edu.niit.ch6.local");

        System.out.println(r3.getString("System.name"));
        System.out.println(r3.getString("input.username"));
        String name=input.nextLine();
        System.out.println(r3.getString("input.password"));
        String password=input.nextLine();
        try{

        if (("admin".equals(name))&&("123".equals(password))){
              System.out.println(r3.getString("login.success"));

        }else {
            System.out.println(r3.getString("login.failure"));
        }
        }catch (Exception e){
            e.printStackTrace();
        }finally {

        }


    }
}
