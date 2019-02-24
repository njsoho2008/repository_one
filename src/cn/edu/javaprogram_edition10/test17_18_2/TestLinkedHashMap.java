package cn.edu.javaprogram_edition10.test17_18_2;
import java.util.*;
public class TestLinkedHashMap{
    public static void main(String[] args){
        Map<String,String> map=new LinkedHashMap<>();
        map.put("123","John Smith");
        map.put("111","George Smith");
        map.put("123","Steve Yao");
         map.put("222","Steve Yao");
        System.out.println("(1)"+map);
        System.out.println("(2)"+new TreeMap<String,String>(map));
       

    }

}