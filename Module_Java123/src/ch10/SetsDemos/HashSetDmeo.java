package ch10.SetsDemos;

import ch10.CollectionsDemos.CollectionDemo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetDmeo {
    public static void main(String[] args){
        Set<String> set=new HashSet<>();
        set.add("hunan");
//        set.addAll(CollectionDemo.getCollection());
        set.add("Paris");
        set.add("New York");
        set.add("beijing");
        set.add("Nanjing");
        System.out.println(set);

        for (String s:set
             ) {
            System.out.print(s.toUpperCase()+" ");

        }

    }
}
