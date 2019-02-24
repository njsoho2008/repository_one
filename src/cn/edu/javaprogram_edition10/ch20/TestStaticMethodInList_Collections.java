package cn.edu.javaprogram_edition10.ch20;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TestStaticMethodInList_Collections {

    public static void main(String[] args){

        List<Integer> list1= Arrays.asList(22,4,7,9,11,13,15,19,21,22,77,99);
        List<String> list2=Arrays.asList("yellow","red","green","blue");
        List<String> list3=Arrays.asList("yellow","red","green","blue");

        Collections.sort(list2,Collections.reverseOrder());
        Collections.reverse(list2);//逆序排

        System.out.println(list1);
        System.out.println(list2);
        //binaySearch的使用前提是默认要升序排序
        Collections.sort(list1);
       int index1=Collections.binarySearch(list1,11);
       System.out.println("(1) index1="+index1);
        int index2=Collections.binarySearch(list2,"green");
        System.out.println("(2) index2="+index2);

       //shuffle  随机重排
      Collections.shuffle(list2,new Random(20));
      Collections.shuffle(list3,new Random(20));
       System.out.println(list2);
        System.out.println(list3);

        System.out.println(Collections.frequency(list2,"red"));
}
}
