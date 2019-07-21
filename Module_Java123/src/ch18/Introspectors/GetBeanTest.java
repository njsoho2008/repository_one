package ch18.Introspectors;

import org.junit.Test;

public class GetBeanTest {
    @Test
    public void  test(){
       Config config=(Config) BeanFactory.getBean("bean.name");
       String username=config.getUsername();
       String password=config.getPassword();
       String url=config.getUrl();
        System.out.println("Config  的实例值"+ url+"\t"+username+"\t"+ password);
        System.out.println(config.toString());
    }
}
