package ch8;
/*多态：
多态是面向对象三大特性之一
        什么是多态性？
        对象在运行过程中的多种形态。
        多态性我们大概可以分为两类：
        （1）方法的重载与重写
        （2）对象的多态性

        例如：
        //用父类的引用指向子类对象（用大的类型去接受小的类型，向上转型、自动转换）
        Chicken home = new HomeChicken();

        结论：
        在编程时针对抽象类型的编写代码，称为面向抽象编程（或面向接口编程）
        父类通常都定义为抽象类、接口

        对象的多态性：
       对象多态性是从继承关系中的多个类而来，
       向上转型：将子类实例转为父类引用
       格式：父类 父类对象 = 子类实例 ； 自动转换
       以基本数据类型操作为例：int i = ‘a' ;
      （因为char的容量比int小，所以可以自动完成）

向下转型：将父类实例转为子类实例
格式：子类 子类对象 = （子类）父类实例 ；强制转换
以基本数据类型操作为例：char c = (char)97;
 因为整型是4个字节比char 2个字节要大，所以需要强制完成

 多态性小结：
1、方法的重载与重写就是方法的多态性表现
2、多个子类就是父类中的多种形态
3、父类引用可以指向子类对象，自动转换
4、子类对象指向父类引用需要强制转换（注意：类型不对会报异常）
5、在实际开发中尽量使用父类引用（更利于扩展）


        */

//以下是对象的多态

public class PloymorphismDemo {
    public static void main(String[] args){
        displayObject(new CircleFromSimpleGeometicObject(3,"red",true));
        displayObject(new RectangleFromSimpleGeometricObject(4,5,"blue", true));

    }

    public static void  displayObject(SimpleGeometircObject object){
        System.out.println("对象创建于："+object.getDatecreated()+"对象的颜色是："+object.getColor());

    }
}
