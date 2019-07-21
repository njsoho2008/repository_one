package ch18.Introspectors;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;
/*
* 通过内省的API在组装Bean ，Bean对象的值是通过配置文件中来获取
* 提高了代码的可维护性 用new 的方式，不利于维护
*
* */
public class BeanFactory {
    private static Properties prop = new Properties();

    static {
        InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("ch18/Introspectors/config.propertites");

        try {
            prop.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
//获取一个bean的方法
    public static Object getBean(String name) {
        Object bean = null;

        String beanName = prop.getProperty(name);
        try {
            Class<?> clazz = Class.forName(beanName);
            bean=clazz.newInstance();
//            通过内省机制获取bean的信息
            BeanInfo beanInfo = Introspector.getBeanInfo(clazz);

            PropertyDescriptor[] propertyDescriptors= beanInfo.getPropertyDescriptors();
            Method writeMethod;
            for (int i=0;i<propertyDescriptors.length;i++){
                String fieldname=propertyDescriptors[i].getName();
                if("username".equals(fieldname)) {
//                    相当于调用了属性的set方法，赋值
                     writeMethod = propertyDescriptors[i].getWriteMethod();
                     writeMethod.invoke(bean,prop.getProperty("bean.username"));

                }else if("password".equals(fieldname)){

                    writeMethod=propertyDescriptors[i].getWriteMethod();
                    writeMethod.invoke(bean,prop.getProperty("bean.password"));
                }else if("url".equals(fieldname)){


                    writeMethod=propertyDescriptors[i].getWriteMethod();
                    writeMethod.invoke(bean,prop.getProperty("bean.url"));
                }
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IntrospectionException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return bean;

    }
}
