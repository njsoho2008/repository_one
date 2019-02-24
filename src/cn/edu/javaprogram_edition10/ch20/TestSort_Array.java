package cn.edu.javaprogram_edition10.ch20;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestSort_Array {
     private  String[] str={"london","beijing","new york","colifonia","las vigas"};

    public static void main(String[] args){
        TestSort_Array t_a=new TestSort_Array();
        System.out.println(t_a.str.length);
        List<String> list=Arrays.asList(t_a.str);
        Collections.sort(list);
        Collections.binarySearch(list,"new york");
        String strMax=Collections.max(list);
        System.out.println(list+"其中最大的元素是： "+strMax);
    }

}
