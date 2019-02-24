package ch8.homework;

import ch7.homework.MyDate;

public class Employee extends Person {
    private String officehome;
    private double salary;
    private MyDate hiredDate;

    public  Employee(){
        this.hiredDate=new MyDate();
    }

    public Employee(String name, String address, String telcode, String email, String officehome, double salary) {
        super(name, address, telcode, email);
        this.officehome = officehome;
        this.salary = salary;
    }

    public String getOfficehome() {
        return officehome;
    }

    public void setOfficehome(String officehome) {
        this.officehome = officehome;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(MyDate hiredDate) {
        this.hiredDate = hiredDate;
    }
    @Override
    public String toString(){
        return  this.getClass().getName()+","+this.getName();
    }
}
