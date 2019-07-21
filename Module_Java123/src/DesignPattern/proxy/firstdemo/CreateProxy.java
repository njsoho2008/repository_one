package DesignPattern.proxy.firstdemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*用于生成代理类对象
* 用于生成一个动态代理对象
*
* */
public class CreateProxy implements InvocationHandler {
//    创建被代理对象
    private Object target;
//    定义创建代理对象的方法,去创建一个代理对象
    public Object create(Object target){
        this.target=target;
       Object proxy= Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);

        return proxy;
//        代理的工作如何完成，见下面的invoke方法
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("去海外淘货....");
        System.out.println("跟客户确认物品");
        method.invoke(target,args);
        System.out.println("完成了海外购物");

        return null;
    }
}
