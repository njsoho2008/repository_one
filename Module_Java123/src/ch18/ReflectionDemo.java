package ch18;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class ReflectionDemo {
    //    三种获取 类对象 的方式  取得类 非类的实例
    @Test
    public void test1() {
//        方法一
        Class<Dog> dogClass = Dog.class;
//        方法二
        Dog dog = new Dog("小白", 12, "black");
        Class<? extends Dog> dogclass = dog.getClass();

        System.out.println("dog class :"+dogClass.toString());

//方法三  Class.forName()

        try {
            Class<? extends Object> dogClass1 = Class.forName("ch18.Dog");
            System.out.println("取得类Class   " + dogClass1.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //取得类的实例
    @Test
    public void test2() {
        Dog dog = new Dog("小白", 12, "black");
        Class<? extends Dog> dogclass = dog.getClass();
        try {
            Dog dog2 = dogclass.newInstance();
            System.out.println("Dog类的实例：" + dog2.toString());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

    //    获取构造函数
    @Test
    public void test3() {
        Dog dog = new Dog("小白", 12, "black");

        Class<? extends Dog> dogClass = dog.getClass();

        Class<Dog> dogClass2 = Dog.class;
        try {
            Constructor<? extends Dog>[] dogC = (Constructor<? extends Dog>[]) dogClass2.getConstructors();
            for (int i = 0; i < dogC.length; i++) {
                System.out.println("\n 输出构造方法的签名：" + dogC[i].toString());
                System.out.println("\n 输出构造方法的参数的个数：" + dogC[i].getParameterCount());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
//        getConstructor()    仅能获取公共的构造方法
            Constructor<? extends Dog> constructor = dogClass2.getConstructor(String.class, int.class,
                    String.class);
            Dog dog1 = constructor.newInstance("旺旺", 5, "白色");
            System.out.println(dog1.toString());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
//getDeclaredConstructor()可以获取指定的构造方法;打破了单利设计模式的初衷
        try {
            Constructor<? extends Dog> constructor = dogClass2.getDeclaredConstructor(String.class, int.class, int.class);
            constructor.setAccessible(true);
            Dog privatedog = constructor.newInstance("嘿嘿", 111, 10000);
            System.out.println("调用私有构造函数创建一个新的实例=" + privatedog.toString());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }

    //获得类的属性（即 成员变量）
    @Test
    public void test4() {
        Class<Dog> dogClass = Dog.class;
//
        Field[] fields = dogClass.getFields();
//        只能获取到公有的属性，私有的获取不到
        System.out.println(fields.length);
        for (int k = 0; k < fields.length; k++) {
//            fields[k].setAccessible(true);
            System.out.println("Dog的属性[" + k + "]=" + fields[k]);

        }
        System.out.println("===========================");
//        获取私有属性
        Field[] fields2 = dogClass.getDeclaredFields();
        for (int i = 0; i < fields2.length; i++) {


            System.out.println("Dog的属性[" + i + "]=" + fields2[i]);

        }
    }

    @Test
    public void test5() {
        Dog dog = new Dog("ww", 1, "black");

        Class<Dog> dogClass = Dog.class;
        Package pkg = dogClass.getPackage();
        System.out.println(pkg.toString() + "\n\t" + pkg.getName());
        Method[] methods = dogClass.getMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].toString());

            try {
                if (methods[i].getName().equals("toString")) {
//                    调用toString方法;在什么对象上调用toString
                    String s = (String) (methods[i].invoke(new Dog("www", 3, "black")));
                    System.out.println("自定义的狗" + s);
                }

//如果要调用带参数的方法，需要通过反射技术单独get 相应的方法

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n===============");
        Method[] methods1 = dogClass.getDeclaredMethods();
        for (int i = 0; i < methods1.length; i++) {
            System.out.println(methods1[i]);
            if (methods1[i].getName().equals("getAge")) {
                methods1[i].setAccessible(true);
                try {

                    int k = (int) methods1[i].invoke(dog);
                    System.out.println("狗的年龄是=" + k);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("\n------------------------------");
        Method m = null;
        try {
            m = dogClass.getMethod("setName", String.class);
            m.invoke(dog, "小红花");
            System.out.println("小狗的名字是：" + dog.getName());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        try {
            Method method = dogClass.getDeclaredMethod("setAge", int.class);
            System.out.println("声明的方法：" + method.toString());
            Method method1 = dogClass.getDeclaredMethod("setColor", String.class);
            System.out.println("声明的方法" + method1.toString());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


    }
}
