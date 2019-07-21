package DesignPattern.proxy.firstdemo;

import DesignPattern.proxy.firstdemo.CreateProxy;
import DesignPattern.proxy.firstdemo.Person;
import DesignPattern.proxy.firstdemo.Subject;
import org.junit.Test;

public class TestDemo {
    @Test
    public void testProxy() {
        CreateProxy cp = new CreateProxy();
        Subject person = new Person();
        Subject proxy = (Subject) cp.create(person);
        proxy.shopping();

    }
}
