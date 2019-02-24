package ch7;

public class CircleWithStaticMembersDemo {
    private double radius;
   private static int numberofObjects;  //全局成员变量

    //    通常情况下至少要定义一个无参数的构造函数，用户初始化重要初始值
//    在人工定义了任何形式的构造函数后，系统优先调用人工定义的构造函数
//    无任何人造构造函数的情况下，编译系统自动启动一个无参数方法体为空的构造函数
    public CircleWithStaticMembersDemo() {
        this(9);
    }

    public CircleWithStaticMembersDemo(double radius) {
        this.radius = radius;
        numberofObjects++;

    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double newradius) {
        this.radius = (newradius>=0)?newradius:0;
    }

    public static int getNumberofObjects() {
        return numberofObjects;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        System.out.println(new CircleWithStaticMembersDemo().radius);
        System.out.println(CircleWithStaticMembersDemo.numberofObjects);
        System.out.println(CircleWithStaticMembersDemo.getNumberofObjects());
        CircleWithStaticMembersDemo circle2 = new CircleWithStaticMembersDemo(10);
        System.out.println(circle2.getRadius());
        System.out.println(circle2.getArea());
//        System.out.println(this.getArea()); //this指代实例本身，无法运行与静态方法内
    }


}
