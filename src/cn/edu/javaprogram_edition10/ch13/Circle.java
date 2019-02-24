package cn.edu.javaprogram_edition10.ch13;


public class Circle extends  GeometricObject {
    private  double radius;

    public Circle(){
        super();

    }

    public Circle(double radius) {
        this.radius = radius;


    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {


        return Math.PI*this.getRadius()*this.getRadius();
    }

    @Override
    public double getPerimeter() {
        return  2*Math.PI*this.getRadius();
    }
}
