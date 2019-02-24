package ch8;

public class RectangleFromSimpleGeometricObject extends SimpleGeometircObject {
    private double width;
    private double height;

    public RectangleFromSimpleGeometricObject(){
        super();

    }
    public RectangleFromSimpleGeometricObject(double width,double height){
        this.width=width;
        this.height=height;

    }

    public  RectangleFromSimpleGeometricObject(double width,double height,String color,boolean filled){
         super();
        this.width=width;
        this.height=height;
        setColor(color);
        setFilled(filled);
    }

    public void setWidth(double width){
        this.width=width;
    }
    public double getWidth(){
        return width;
    }

    public void setHeight(double height){
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public double getArea(){
        return  this.width*this.height;
    }

    public  double getPermeter(double width,double height){
        return  2*(width+height);
    }
    public String toString(){
        return "矩形的高"+this.getHeight()+"矩形的宽"+this.width+"\n"
                +"矩形的面积"+this.getArea();
    }
}
