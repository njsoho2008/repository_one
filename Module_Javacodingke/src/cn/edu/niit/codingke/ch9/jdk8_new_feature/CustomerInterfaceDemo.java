package cn.edu.niit.codingke.ch9.jdk8_new_feature;

import java.util.ArrayList;
import java.util.List;

public class CustomerInterfaceDemo {
    //JDK1.8


    public static void Antherforeach(List<String> list){
        //消费者接口
     /*   Consumer<String> customer=new Consumer<String>() {
            @Override
            public void accept(String s) {

            }
        };*/
        //Lamda 表达式使用要求：接口里面只有一个方法，可以建议使用lambda表达式
        list.forEach((String s)->{System.out.println(s);} );
        System.out.println("---------------------------------------");
        list.forEach(s->System.out.println(s));



    }


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("John");
        list.add("tom");
        list.add("davis");
        list.add("thrump");
        Antherforeach(list);

    }
}
