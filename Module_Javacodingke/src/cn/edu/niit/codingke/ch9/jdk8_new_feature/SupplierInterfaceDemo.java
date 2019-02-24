package cn.edu.niit.codingke.ch9.jdk8_new_feature;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

public class SupplierInterfaceDemo {
    /*JDK 1.8
    ----Supplier-接口 ---------

    结果供应商，前提是自己给*/


    private static void SupplierTest(){
          List<Integer> list=getNums(4,()->(int)( Math.random()*100));
      list.forEach(i->System.out.println(i));
        System.out.println("----------------------------");
      list.forEach(System.out::println);
      System.out.println("----------------------------");
      Iterator<Integer> iterator=list.iterator();
      while (iterator.hasNext()){
          System.out.println(iterator.next());
      }



    }
    private static List<Integer> getNums(int num,Supplier<Integer> supplier){
        List<Integer> list=new ArrayList<Integer>();
        for (int i=0;i<num;i++){
            list.add(supplier.get());
        }

        return  list;


    }
    public static void main(String[] args){
        SupplierTest();

    }

}
