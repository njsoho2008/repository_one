package ch11.EventHandle.one;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Circle {
    private double radius;
    private Date createDate;
    public Circle(){
         Date date=new Date();
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd: HH:mm:ss");
        String str=dateFormat.format(date);
        System.out.println(str);

    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }
}
