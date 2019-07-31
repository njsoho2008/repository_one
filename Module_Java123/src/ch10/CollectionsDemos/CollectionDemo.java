package ch10.CollectionsDemos;

import java.util.*;

public class CollectionDemo {
  public   static Collection<String> collection;

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("纽约");
        list.add("atlanta");
        list.add("Dallas");
        list.add("999999");
        System.out.println(list);

        //Collections 工具类的使用

        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);

        System.out.println(list);

        Collections.shuffle(list,new Random(40));

        System.out.println(list);

//Collection 是个集合的接口
       Collection<String> collection1 = new ArrayList<>();
        ((ArrayList<String>) collection1).add("河南");
        ((ArrayList<String>) collection1).add("北京");
        ((ArrayList<String>) collection1).add("江苏");
        ((ArrayList<String>) collection1).add("江苏");
        ((ArrayList<String>) collection1).add("江苏");
        ((ArrayList<String>) collection1).add("江苏");
        collection=collection1;

        Collection<String> collection2 = new ArrayList<>();

//如下写法请记住 类型的转换

        ArrayList<String> collection3 = (ArrayList<String>) (((ArrayList<String>) collection1).clone());

        ((ArrayList<String>) collection2).addAll(collection3);
        //Collections 工具类的使用  合集collection1,collection2 中如果没有相同的元素 则返回false
        boolean b = Collections.disjoint(collection1, collection2);
        //Collections 工具类的使用  合集collection1中指定的元素个数
        int i = Collections.frequency(collection1, "江苏");


        System.out.println(b + "   " + "\n" + i);
        System.out.println(collection1);
        System.out.println(collection2);
        System.out.println(collection3);


    }
}
