package cn.edu.niit.codingke.ch9;

/*
* 最常用的List有ArrayList LinkedList
* Vector
*
* 他们都是List接口的实现，List
*接口的超类是Collection，
*
* List 允许多个null存在
* 是有序排列的，元素可以重复
*
*
* ArrayList 通过动态数组扩展构建， 扩充办法：原来数组大小+原来数组大小的二分之一
* 动态数组不适合删除 和插入操作(动态的，位置是会变化的)
*
*
* 查看源代码；
*
* >>>1  等移位操作
*
*
* */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AllLIstDemo {

    public static void arrayList() {
        List<String> alist = new ArrayList();
        alist.add("苍井空");
        alist.add("苍老师");
        alist.add("日语");
        alist.add("语文");
        int size = alist.size();
        for (int i = 0; i < size; i++) {
            System.out.println(alist.get(i));
        }
        System.out.println(alist.contains("苍老师"));

        System.out.println(alist.remove("语文"));
        System.out.println(alist.indexOf("苍老师"));

        String[] str = alist.toArray(new String[]{});
        System.out.println("----------------------------------");
        for (String s : str) {
            System.out.println(s);
        }

    }

    // 链表list
//    适合插入和删除操作，效率高
//            采用双向链表结构
    public static void LinkedListMethod() {
        List<String> list = new LinkedList<>();
        list.add("苍井空");
        list.add("苍老师");
        list.add("日语");
        list.add("语文");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            System.out.println(list.get(i));
        }
    }


    public static void main(String[] args) {
        arrayList();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        LinkedListMethod();


    }
}
