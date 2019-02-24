package cn.edu.niit.codingke.ch9;

/*Set接口 集合的特点

不允许元素重复，无序的

null 只有一个
常用的实现类 有HashSet、 TreeSet  LinkedHashSet

*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    /*1.基于HashMap 哈希表构建【数组+链表=哈希表】（实现原理）
    *2. 不允许重复 ，可以有一个null
    * 3. 不保证顺序恒久不变
    * 4.添加元素时候，把元素作为HashMap的Key  HashMap的Value使用一个固定的值（Object对象）来存入
    * 5.如何排除重复的对象：
    * */
    public static void hashset() {
        Set<String> hset = new HashSet<>();
        hset.add("诸葛亮");
        hset.add("曹操");
        hset.add("刘备");
        hset.add("孙权");
        hset.add("孙权");

        String[] str = hset.toArray(new String[]{});
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        System.out.println("采用 foreach 格式输出");
        for (String s:str) {
            System.out.println(s);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Iterator<String> iterator = hset.iterator();


        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        Set<Cat> cats = new HashSet<>();
        Cat c1 = new Cat("bsm", 5, 1);
        Cat c2 = new Cat("ls", 11, 2);
        Cat c3 = new Cat("大白猫", 4, 3);
        Cat c4 = new Cat("大白猫", 4, 3);

        cats.add(c1);
        cats.add(c2);
        cats.add(c3);
        cats.add(c4);
        cats.add(c1);
        System.out.println("输出4个对象的Hashcode");
        System.out.println("如果对16取余，则得到对象在哈希数组【数组+链表】中存储的下标(位置)");
        System.out.println(c1.hashCode()%16);
        System.out.println(c2.hashCode()%16);
        System.out.println(c3.hashCode()%16);
        System.out.println(c4.hashCode()%16);

        Cat[] catArray = cats.toArray(new Cat[]{});
        for (int i = 0; i < catArray.length; i++) {
            System.out.println(catArray[i].toString());

        }
        System.out.println("~~~~~~~C3和C4 两者是不同的对象~~；~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("如果需要从对象的属性值相同(相等)这个角度去判断2个对象相同，" +
                "则需要重写该实体类的hashcode方法和equals方法，以剔除相同的2个对象");
        Iterator<Cat> iterator1 = cats.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next().toString());
        }
    }

    public static void main(String[] args) {
        hashset();
    }
}
