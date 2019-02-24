package ch7.homework;

import java.util.Date;

public class Account {
    private  int id=0;
    private double balance=0.0;
    private double annualInterestRate=0.0;
    private Date dateCreated;

    public Account(){
        this.id=0;
        this.balance=0;
        this.annualInterestRate=0;
        this.dateCreated=new Date();
    }




    public Account(int id,double balance){
        this();
        this.id=id;
        this.balance=balance;
//        this.dateCreated=new Date();


    }

    public int getId(){
        return  this.id;
    }

    public void setId(int id){
        this.id=id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate(){


        return  getAnnualInterestRate()/12;
    }

    //取钱
    public void withDraw(double out){
        this.balance=getBalance()-out;

    }

    //存钱
    public double deposit(double in){
        return  this.balance=getBalance()+in;

    }

    //计算月利息
    public  double getMonthlyInterest(){
        return  this.getMonthlyInterestRate()*(this.balance);
    }

    public static void main(String[] args){
        Account myAccount=new Account(112,20000);
        myAccount.setAnnualInterestRate(0.045);

        myAccount.withDraw(2500);
        myAccount.deposit(3000);
        System.out.println("现在账户余额是"+myAccount.getBalance()+"元");

        System.out.println("现在账户余额的月息"+myAccount.getMonthlyInterest()+"元");

        System.out.println("现在账户的开户日期："+myAccount.getDateCreated());

    }
}
