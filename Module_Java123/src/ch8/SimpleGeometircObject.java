package ch8;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleGeometircObject {
    private String color; // 类的特征属性，数据域，成员变量
    private boolean filled;
    private Date datecreated;
    private String formatdate;

    //无参数 带方法体的构造函数
    public SimpleGeometircObject() {
        this.datecreated = new Date();
        System.out.println("距离1970年1月1日零时已经过了"+System.currentTimeMillis()+"毫秒");
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");
        this.formatdate=df.format(this.datecreated);

        System.out.println("我们于"+this.formatdate+"创建了一个圆形，具体信息如下");


    }

    public SimpleGeometircObject(String color) {
        this.color = color;
    }

    public SimpleGeometircObject(String color, boolean filled) {
        this();
//        this(color);
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

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    @Override
    public String toString() {
        return "SimpleGeometircObject{" + "color='" + color + '\'' +
                ", filled=" + filled +
                ", datecreated=" + datecreated +
                '}';
    }
}
