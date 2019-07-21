package DesignPattern.staticproxy;

import org.junit.Test;
//本类 类似于 客户端，来进行测试
public class TestStaticProxy {
    @Test
    public void test(){

        UserManager userManager=new UserManagerImplProxy(new UserManagerImpl());
        ((UserManagerImplProxy) userManager).printLog();
        userManager.addUser("1001","张三");

    }
}
