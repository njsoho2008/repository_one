package ch8;

//在多层继承关系下的构造函数链
public class ConstructorChainDemo extends  Employee{
    public static void main(String[] args){
        new ConstructorChainDemo();
    }

    public ConstructorChainDemo(){
        System.out.println("(4)执行ConstructiorChainDemo的任务");
    }


}

class Employee extends Person{
    public  Employee(){
        this("(2)唤醒重载的Employee的重载方法");
        System.out.println("(3)执行雇员的任务");

    }
    public  Employee(String s){
        System.out.println(s);
    }
}

class Person {
    public Person(){
        System.out.println("(1)执行Person's的任务");
    }
}
