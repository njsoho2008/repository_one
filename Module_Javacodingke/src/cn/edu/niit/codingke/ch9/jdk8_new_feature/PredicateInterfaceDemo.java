package cn.edu.niit.codingke.ch9.jdk8_new_feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterfaceDemo {

    private static void predicateTest(){
        List<String> list=Arrays.asList("ww","wu","fill","rrrr","ill");
        List<String> rs=filter(list,s ->s.contains("ill") );
        rs.forEach(s->System.out.println(s));


    }
    private static List<String> filter(List<String> list, Predicate<String> p){
        List<String> results=new ArrayList<>();

        for (String s:list){

            if(p.test(s)){

            results.add(s);

            }
        }


        return  results;




    }
    public static void main(String[] args){
      predicateTest();
    }


}
