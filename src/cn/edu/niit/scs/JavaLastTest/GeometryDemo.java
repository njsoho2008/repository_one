package cn.edu.niit.scs.JavaLastTest;


public class GeometryDemo {
    public static void main(String[] args){
        Rectangle rectangle=new Rectangle(4,5);
        System.out.println(rectangle.CalCircumference());
        System.out.println(rectangle.CalSquare());
    }

}


class Rectangle {
    private double width;
    private double height;

    public Rectangle(){

    }

    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;

    }

    public double CalCircumference(){
        return 2*(this.width+this.height);
    }

    public double CalSquare(){
        return  this.width*this.height;
    }




}

