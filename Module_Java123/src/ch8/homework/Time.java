package ch8.homework;

import sun.text.resources.FormatData;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
    private long hour;
    private long minute;
    private long second;
    private long time;

    public long getHour() {
        return hour;
    }

    public void setHour(long hour) {
        this.hour = hour;
    }

    public long getMinute() {
        return minute;
    }

    public void setMinute(long minute) {
        this.minute = minute;
    }

    public long getSecond() {
        return second;
    }

    public void setSecond(long second) {
        this.second = second;
    }

    public Time() {
        this.time = System.currentTimeMillis();
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd:HH-mm-ss");
        String str = dateFormat.format(date);
        System.out.println("当前时间是：" + str);
    }

    public Time(long l) {
    }

    public mydef_Date getPassTime(long l) {
        long totalseconds = l / 1000;
        long currentsecond = totalseconds % 60;
        long totalminutes = totalseconds / 60;
        long currentminute = totalminutes % 60;
        long totalhours = totalminutes / 60;
        long currenthour = totalhours % 60;

        return new mydef_Date(currenthour, currentminute, currentsecond);

    }

    class mydef_Date {
        long hour;
        long minute;
        long seconds;

        public long getHour() {
            return hour;
        }

        public long getMinute() {
            return minute;
        }

        public long getSeconds() {
            return seconds;
        }

        public mydef_Date() {
        }

        public mydef_Date(long hour, long minute, long seconds) {
            this.hour = hour;
            this.minute = minute;
            this.seconds = seconds;
        }

        @Override
        public String toString() {
            return "截止目前，已经过去了：" + this.getHour() + "小时" + this.getMinute() + "分"
                    + this.seconds + "秒";

        }
    }
    public static void main(String[] args) {
        Time time = new Time();
        mydef_Date mydef_date = time.getPassTime(9900000);
        System.out.println(mydef_date.toString());


    }

}