package ch10.SetsDemos;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

    public static void main(String[] args){
    Set<String> set=new LinkedHashSet<>();
    set.add("London");
    set.add("徐州");
    set.add("蚌埠");
    set.add("上海");
    System.out.println(set);

        for (String e:set
             ) {
            System.out.println(e);

        }
}

}
