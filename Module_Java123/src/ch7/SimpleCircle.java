package ch7;

public class SimpleCircle {
    public double radius;  //成员变量（实例变量）或者叫属性
    private String color;
    public  static String str="以圆圈为例来学习";  //成员变量（静态变量）也是属性 定义全局共享静态变量
    public SimpleCircle(){
        this.radius=3;
    }
    public SimpleCircle(double radius){
        this.radius=radius;

    }
    public SimpleCircle(double radius,String color){
        this(radius);//启用了this调用第二个构造函数
//        this.radius=radius;  启用了this调用
        this.color=color;
    }

    public double getArea(double radius){
           return  Math.PI*Math.pow(radius,2);

    }
    public double getPerimeter(double radius){
        return  2*Math.PI*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
