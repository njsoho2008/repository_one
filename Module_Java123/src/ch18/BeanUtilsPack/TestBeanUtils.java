package ch18.BeanUtilsPack;

import ch18.Dog;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

public class TestBeanUtils {
    @Test
    public void test() {
        //以下数据来自于客户端网页
        String name = "小白";
        int age = 10;
        String salary = "20000";

        Dog dog=new Dog();
        try {
            BeanUtils.setProperty(dog,"name",name);
            BeanUtils.setProperty(dog,"age",age);
            BeanUtils.setProperty(dog,"salary",salary);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
