package cn.edu.javaprogram_edition10.ch20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args){
        Collection<String> collection=new ArrayList<>();
        ((ArrayList<String>) collection).add("New York");
        ((ArrayList<String>) collection).add("atlanta");
        ((ArrayList<String>) collection).add("Dallas");
        ((ArrayList<String>) collection).add("Madison");

        Iterator<String> interator=collection.iterator();
        while (((Iterator) interator).hasNext()){
            System.out.println(interator.next().toUpperCase()+"   ");
        }

        System.out.println();


    }

}
