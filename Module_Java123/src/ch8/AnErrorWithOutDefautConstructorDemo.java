
package ch8;

public class AnErrorWithOutDefautConstructorDemo extends Fruit{

    public AnErrorWithOutDefautConstructorDemo(){
        super("橘子");
        System.out.println("通常一个类要提供一个默认的无参构造函数");

    }


    public  static void main(String[] args){
        AnErrorWithOutDefautConstructorDemo aerror=new AnErrorWithOutDefautConstructorDemo();

    }

}

class Fruit{
//    public Fruit(){System.out.print("sdsfdfds");}
    public Fruit(String name){
        System.out.println("有参数构造函数Fruit被调用");

    }
}
