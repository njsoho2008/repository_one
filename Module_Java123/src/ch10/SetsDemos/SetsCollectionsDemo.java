package ch10.SetsDemos;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetsCollectionsDemo {

//    add string to set1

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();

        set1.add("London");
        set1.add("Paris");
        set1.add("New York");
        set1.add("San Franciso");
        set1.add("Beijing");
        set1.add("Beijing");

        System.out.println("1:"+set1);

        System.out.println(set1.size());

        Set<String> set2 = new HashSet<>();

        set2.add("南通");
        set2.add("上海");
        set2.add("北京");
        set2.add("天津");

        set1.addAll(set2);

        System.out.println("2:"+set1);

        set1.removeAll(set2);

        System.out.println("3:"+set1);




    }

}
