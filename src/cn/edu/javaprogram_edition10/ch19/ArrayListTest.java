package cn.edu.javaprogram_edition10.ch19;

import java.util.ArrayList;
import java.util.Date;

public class ArrayListTest {

    public static void main(String[] args){
        ArrayList<Double> list=new ArrayList<>();
        list.add(4.9);
        list.add(5.0);
        System.out.println(list.get(0)+list.get(1));

        ArrayList<Date> list1=new ArrayList<>();
        list1.add(new Date());
        System.out.println("当前日期是："+list1.get(0));

    }
}
