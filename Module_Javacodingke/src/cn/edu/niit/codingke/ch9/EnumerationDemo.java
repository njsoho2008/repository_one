package cn.edu.niit.codingke.ch9;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

    public static void main(String[] args){
        Vector<String> vs=new Vector<>();
        vs.add("Tom");
        vs.add("jack");
        vs.add("Jhon");
        vs.add("lily");
        Enumeration<String> enumeration=vs.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
