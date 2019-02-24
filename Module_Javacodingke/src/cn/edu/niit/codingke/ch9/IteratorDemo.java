package cn.edu.niit.codingke.ch9;

/*前面我们已经学习了集合的基本操作，很多情况下，我们需要把集合的内容进行输出，也就是遍历集合。
        遍历集合的方式有以下几种：
        1、 Iterator
        2、 ListIterator
        3、 Enumeration
        4、 foreach
        其中Iterator的使用率最高，在JDK1.5后新增的foreach也被大量使用
        */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

    /*foreach迭代
    *
    * JDK1.5之后
    *
    * */

    public static void ForEach(Collection<Cat> c){
        for (Cat ct:c){
            System.out.println(ct);
        }

    }
    public  static void Iterator2Method(Collection<Cat> c){
        Iterator<Cat> iterator=c.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    public static void main(String[] args){
        List<Cat> list=new ArrayList<>();
        Cat c1 = new Cat("bsm", 5, 1);
        Cat c2 = new Cat("ls", 11, 2);
        Cat c3 = new Cat("大白猫", 4, 3);
        Cat c4 = new Cat("大白猫", 4, 3);
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);




        ForEach(list);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Iterator2Method(list);
    }
}
