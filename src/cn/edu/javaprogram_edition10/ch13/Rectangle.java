package cn.edu.javaprogram_edition10.ch13;


public class Rectangle extends GeometricObject {
    private double width;
    private  double height;

    public  Rectangle(){
        super();
    }

    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
//        super(color, filled);
        this.width = width;
        this.height = height;
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.getHeight()*this.getWidth();
    }

    @Override
    public double getPerimeter() {
        return 2*(this.getHeight()*this.getWidth());
    }
}
