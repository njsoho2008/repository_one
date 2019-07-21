package DesignPattern.proxy.firstdemo;

public class Person implements Subject,Hotel {
    @Override
    public void shopping() {
        System.out.println("主人的工作：付款，买到心仪的Jack杉");
        System.out.println("至于如何买，如何挑选款式，则交给代理类去完成");
    }

    @Override
    public void reserve() {
        System.out.println("预定酒店");

    }
}
