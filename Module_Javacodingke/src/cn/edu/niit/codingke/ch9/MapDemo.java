package cn.edu.niit.codingke.ch9;

/*Map 存储键值对
key不可以重复 value 可以重复
具体的实现类 HashMap TreeMap Hashtable LinkedHashMap*/

import java.io.StreamTokenizer;
import java.util.*;

public class MapDemo {

    /*
    * 因为hashmap不能保证顺序的恒久不变，linkedhashmap通过
    *
    * */

    private static void linkedhashmap(){
          Map<String,String> tb=new LinkedHashMap<>();

        tb.put("one","忍者");
        tb.put("two","自然");
        tb.put("three","地理");

        tb.forEach((key,value)->System.out.println(key+"->"+value));


    }



/*
jdk1.0 开始

    基于哈希表实现(数组+链表)
    默认数组长度11，加载因子 0.75f
    扩充方式<<1(*2)+1

    方法前面有修饰符 synchronized  是线程安全的

*/



    private static void hashtable(){
        Map<String,String> table=new Hashtable<>();
        table.put("one","忍者");
        table.put("two","自然");
        table.put("three","地理");

        table.forEach((key,value)->System.out.println(key+"->"+value));

    }




  /*  hashmap的原理
         1.哈希表：哈希表+数组+

    二叉树(红黑二叉树)
2.加载因子：默认0.75 75%，即使数组用到75%。
    作为一个一般规则，默认负载因子（。75）提供了一个很好的时间和空间成本之间的权衡。
    较高的值会降低空间开销，但提高查找成本
    （体现在大多数的HashMap类的操作，包括get和put）。


    */



    private static void hashmaptest() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "jhon");
        map.put(2, "vince");
        map.put(3, "rose");
        map.put(4, "tom");
        map.put(5, "tomson");
        System.out.println("map" +
                "中有" + map.size() + "个元素");
        System.out.println(map.get(4));
//        map的遍历，map是通过内部的一个个entry实体来存储键值对
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for (Map.Entry e : set) {
            System.out.println(e.getKey() + "," + e.getValue());
        }
        System.out.println("-----------------------------------");
        //生成keyset集合
        Set<Integer> kset = map.keySet();
        for (Integer i : kset) {
            System.out.println(i.intValue() + "," + i.floatValue());
        }
        //生产value集合
        Collection<String> collection = map.values();
        for (String str : collection) {
            System.out.println(str);
        }

        //forEach 函数
        map.forEach((k, value) -> System.out.println(k + "->" + value));
        System.out.println(map.containsKey(8));
        System.out.println(map.replace(4, "tom", "tombaobao"));
    }

    public static void main(String[] args) {
        /*hashmaptest();

        hashtable();*/

        linkedhashmap();
    }
}
