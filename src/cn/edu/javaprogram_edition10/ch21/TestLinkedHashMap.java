package cn.edu.javaprogram_edition10.ch21;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestLinkedHashMap {
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
