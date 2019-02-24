package ch9;

import java.util.Date;

public abstract class GeometircObject {
    public String color = "white";

    public boolean filled = false;

    public Date createdDate;

    public GeometircObject(){
        this.createdDate=new Date();

    }

    public GeometircObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
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


    public String toString(){
        return "Create On" +createdDate+"\ncolor:"
                +color+"and filled:"+filled;
    }

    public abstract double getArea();

    public abstract  double getPerimeter();

}