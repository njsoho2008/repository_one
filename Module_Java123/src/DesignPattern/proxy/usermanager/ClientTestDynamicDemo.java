package DesignPattern.proxy.usermanager;

import DesignPattern.staticproxy.UserManager;
import DesignPattern.staticproxy.UserManagerImpl;
import org.junit.Test;

public class ClientTestDynamicDemo {
    @Test
    public void test(){
       DynamicProxyUserManager dynamicProxyUserManager=new DynamicProxyUserManager();
       UserManager userManager=new UserManagerImpl();
       UserManager proxyInstance=(UserManager) dynamicProxyUserManager.NewProxyInstance(userManager);
       proxyInstance.addUser("1002","lisi");
    }
}
