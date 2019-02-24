package ch7;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//学习使用日期类 和dateformat类
public class DateDemo {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("从1970年1月1日到现在的时间是" + date.getTime() + "\n date.toString=" + date.toString());
        System.out.println("系统从1970.1.1日零时流逝的时间是：" + System.currentTimeMillis());

        Date date_curr=new Date(System.currentTimeMillis());//


        DateFormat df=new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss");

        String dateformat=df.format(date);
        String dateformat_curr=df.format(date_curr);

        System.out.println(dateformat);
        System.out.println(dateformat_curr);


    }

}
