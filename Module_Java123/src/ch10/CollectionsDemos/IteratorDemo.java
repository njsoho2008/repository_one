package ch10.CollectionsDemos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo  {
    public static void main(String[] args){
        Collection<String> collection=new ArrayList<>();
        ((ArrayList<String>) collection).add("new york");
        collection.add("atlata");
        ((ArrayList<String>) collection).add("Tokyo");
        ((ArrayList<String>) collection).add("peking");
        ((ArrayList<String>) collection).add(2,"hunang");

        Iterator<String> iterator=collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toUpperCase());
        }
        System.out.println();
    }
}
