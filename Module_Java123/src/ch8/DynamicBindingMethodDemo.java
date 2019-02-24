package ch8;

import javax.swing.*;

/*  动态绑定

方法可以在沿着继承链的多个类中实现,（首先这是一种覆盖即overriding）JVM决定运行时调用哪个方法
toSting()方法的覆盖，不同实现*/
public class DynamicBindingMethodDemo {
    public static  void main(String[] args){
        m(new GraduateStudent());
        m(new Student());
        m(new CPerson());
        m(new Object());
    }

    public static void m(Object x){
        System.out.println(x.toString());
    }

}
class GraduateStudent extends Student{

}
class  Student extends CPerson{
    public String toString(){
        return  "student";
    }
}

class CPerson extends Object{
    public  CPerson(){}
    public CPerson(String name){
        System.out.println("my name is "+name);

    }
    public String toString(){
        return  "Person";
    }
}