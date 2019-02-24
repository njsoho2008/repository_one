package cn.edu.javaprogram_edition10.ch13;


import java.util.Date;

public abstract class GeometricObject {
    private  String  Color;
    private  boolean filled;
    private Date  createdDate;

    protected  GeometricObject(){
        this.createdDate=new Date();

    }

    protected GeometricObject(String color,boolean filled){
        this.createdDate=new Date();
        this.Color=color;
        this.filled=filled;

    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public boolean isFilled(boolean filled) {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public  abstract  double getArea();

    public  abstract  double getPerimeter();
}
