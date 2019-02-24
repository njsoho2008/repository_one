package cn.edu.niit.codingke.ch9;
/*
*  不要排序，但是要保证顺序，可以用LinkedHashSet
*   要排序，请选择TreeSet
*   不要排序，也不要保证顺序，可以用HashSet
*
*
* */

import java.util.LinkedHashSet;


public class LinkedHashSetDemo {

    public static void LinkHashSet() {
        LinkedHashSet<Cat> set = new LinkedHashSet<>();
        Cat c1 = new Cat("bsm", 5, 1);
        Cat c2 = new Cat("ls", 11, 2);
        Cat c3 = new Cat("大白猫", 4, 3);
        Cat c4 = new Cat("大白猫", 4, 3);
        Cat c5 = new Cat("大白猫", 5, 4);
        set.add(c1);
        set.add(c2);
        set.add(c3);
        set.add(c4);
        set.add(c5);
        for (Cat c : set) {
            System.out.println(c.toString());
        }


    }

    public static void main(String[] args) {

        LinkHashSet();
    }
}
