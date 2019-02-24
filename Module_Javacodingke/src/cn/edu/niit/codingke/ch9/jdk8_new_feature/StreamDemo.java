package cn.edu.niit.codingke.ch9.jdk8_new_feature;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args){

        Stream<String> stream=Stream.of("南京","上海","西安","西安","武汉","合肥","哈尔滨","深圳","东京");
//         stream.forEachOrdered((str)->{System.out.println(str);});
//      只能一个方法一个方法的实验
     //    stream.filter((str)->str.contains("京")).forEach(System.out::println);
//         stream.distinct().forEach((s)->{System.out.println(s);});

//     Iterator<String> iterator= stream.collect(Collectors.toCollection()).iterator();
      List<String> list=stream.collect(Collectors.toList());
      list.forEach((str)->System.out.println(str));
/*
//:: 符号，是表示方法的引用，引用静态方法  如 Integer::valueof
        引用对象中的方法，不要方法的参数，通过lambda表达去推断 如 list::add
                引用构造方法  如 ArrayList::new*/




    }
}
