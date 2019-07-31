package ch10.MapsDemos;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap  {
    public static void main(String[] args){
        Map<String,Integer> hashMap=new HashMap<>();
        hashMap.put("first",1101);
        hashMap.put("second",1102);
        hashMap.put("third",1103);
        hashMap.put("forth",1104);
        System.out.println(hashMap+"\n");

        Map<String,Integer> treeMap=new TreeMap<>(hashMap);
        System.out.println(treeMap);

//        Map<String,Integer> linkedHashMap=new LinkedHashMap<>(16,0.75,true);

      /*   linkedHashMap.put("张三",27);
         linkedHashMap.put("李四",45);
         linkedHashMap.put("王菲",40);
         linkedHashMap.put("董卿",40);

         System.out.println("\n 年龄："+"王菲"+linkedHashMap.get("王菲"));

        System.out.println( linkedHashMap);*/
    }
}
