package ch10.CollectionsDemos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args){

        //熟悉使用ArrayList 和LinkedList 的具体场景或者需求

//        课堂作业，要求学生尝试研读ArrayList源代码
        List<Integer> arraylist=new ArrayList<>();
        arraylist.add(5);
        arraylist.add(90);
        arraylist.add(0,9);
//        index 不可以任意扩大，只能按照size的大小来给定数据
        arraylist.add(3,80);
        System.out.println(arraylist);


        List<Integer> linkedlist=new LinkedList<>();


        linkedlist.add(0,11);
        linkedlist.add(8);
       ((LinkedList<Integer>) linkedlist).addFirst(9);
       ((LinkedList<Integer>) linkedlist).addLast(76);
        System.out.println(linkedlist);

        List<Integer> linkedlist1=new LinkedList<>(arraylist);

    }

}
