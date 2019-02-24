package cn.edu.niit.codingke.ch9;

import java.util.TreeSet;
/*
* TreeSet 是个有序集合，基于TreeMap实现，因为是有序的，所以需要比较大小，比较大小则
*
* 需要将纳入集合的对象实现一个Comparator接口，通过实现该接口来实现比较顺序，如果我们自定义的类cat，
* 没有实现comparator接口的话，将无法存入TreeSet，会报错
*
* 否则会出现如下的错误
*
*
* */

public class TreeSetDemo {

    public static void treeSet(){
        TreeSet<Cat>  treeSet=new TreeSet<>(new CatComparator());
        Cat c1 = new Cat("bsm", 5, 1);
        Cat c2 = new Cat("ls", 11, 2);
        Cat c3 = new Cat("大白猫", 4, 3);
        Cat c4 = new Cat("大白猫", 4, 3);
       treeSet.add(c1);
       treeSet.add(c2);
       treeSet.add(c3);
       treeSet.add(c4);
       Cat[] cats=treeSet.toArray(new Cat[]{});
       for (Cat ct :cats){
           System.out.println(ct.toString());
       }

    }

    public static void main(String[] args){

             treeSet();
    }

}
