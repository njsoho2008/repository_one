package cn.edu.niit.codingke.ch9.jdk8_new_feature;

import java.util.function.Function;

public class FuntionInterfaceDemo {
/*

jdk 1.8
Function<T,R> 接口


*/

    public static void functionTest(){
      String str=toUpper("hello",(s)->s.toUpperCase());
      System.out.println(str);

    }
    public static String toUpper(String s, Function<String,String> f){
      return  f.apply(s);
    }



    public static void main(String[] args){
          functionTest();
    }
}
