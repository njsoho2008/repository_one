package ch7.homework;

import java.util.GregorianCalendar;

public class MyGregorianCalendarDemo {

    public static void main(String[] args){

        GregorianCalendar gc=new GregorianCalendar();
       gc.setTimeInMillis(1234567898765L);
        int cur_year=gc.get(GregorianCalendar.YEAR);
        int cur_month=gc.get(GregorianCalendar.MONTH)+1;
        int cur_day_of_month=gc.get(GregorianCalendar.DAY_OF_MONTH);
        int cur_hour=gc.get(GregorianCalendar.HOUR_OF_DAY);
        int cur_minute=gc.get(GregorianCalendar.MINUTE);

        System.out.println("今天是"+cur_year+"年"+cur_month+"月"+cur_day_of_month+"日");

        System.out.println("现在是："+cur_hour+":"+cur_minute);




    }



}
