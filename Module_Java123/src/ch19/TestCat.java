package ch19;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestCat {

    @Test
    public void test1() {
        Cat cat = new Cat("小猫", 4);

        System.out.print(cat.toString());
        System.out.println();
        System.out.print(cat.printInfo());
//        消除警报
//        Suppress 消除、压制、镇压的意思

        @SuppressWarnings("all")
        List alist;
        alist = new ArrayList();
        alist.add(new Cat("xq", 9));
        alist.add(8);
        alist.add(9.9);

    }

    //通过反射来处理注解
    @Test
    public void test2() {
        Class<Cat> catClass = Cat.class;
//       获取类上应用的指定的注解
        MyDefAnnotation annotation = catClass.getAnnotation(MyDefAnnotation.class);
        int age = annotation.age();
        String[] food = annotation.food();
        System.out.println(age);
        for (int i = 0; i < food.length; i++) {
            System.out.println(food[i]);
        }
        try {
            Cat cat = catClass.newInstance();
            cat.setAge(age);
            cat.setName(annotation.name());
            for (String s : food) {
                cat.setFood(s);
            }
//            cat.setFood(annotation.food());


            cat.setColor(annotation.color());


            System.out.println(cat.toString());

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
