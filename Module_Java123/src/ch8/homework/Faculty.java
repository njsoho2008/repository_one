package ch8.homework;

import java.util.Date;

public class Faculty extends  Employee {
    private Date startTime;
    private double workduratiotime;
    private int level;

    public Faculty(){

    }
    public Faculty(Date date,double d, int i){
        this.startTime=date;
        this.workduratiotime=d;
        this.level=i;

    }

    public Faculty(String name, String address, String telcode, String email, String officehome, double salary, Date startTime, double workduratiotime, int level) {


        super(name, address, telcode, email, officehome, salary);
        this.startTime = startTime;
        this.workduratiotime = workduratiotime;
        this.level = level;

    }

    @Override
    public String toString(){
        return  "Faculty";
    }

}
