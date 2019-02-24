package cn.edu.javaprogram_edition10.ch11;

import java.util.Date;

public class SimpleGeometircObject {
    private String color; // 类的特征属性，数据域，成员变量
    private  boolean filled;
    private  Date datecreated;
    //无参数 带方法体的构造函数
    public  SimpleGeometircObject(){
        this.datecreated=new Date();
        System.out.println(System.currentTimeMillis());

    }
    public  SimpleGeometircObject(String color){
        this.color=color;
    }
    public  SimpleGeometircObject(String color,boolean filled){
    this();
//        this(color);
        this.color=color;
        this.filled=filled;

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

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

@Override
    public   String toString() {
        return "SimpleGeometircObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", datecreated=" + datecreated +
                '}';
    }
}
