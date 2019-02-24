package ch7.homework;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate {
    private int year;
    private int month=1;
    private int day;
    private Date date;
    private Long elapseTime;
    public MyDate(){

       this.date= new Date();
    }

    public MyDate(Long l){
        this.elapseTime=System.currentTimeMillis();
    }
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
    public Date getDate() {
        return date;
    }

    public static  void main(String[] args){

        DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:MM:SS");
       String str= df.format(new Date());
        System.out.print(str);
    }



}
