package ch19;

import java.lang.annotation.*;

//自己定义注解
//三个步骤
//(1) 定义注解
// (2)在类上应用注解
// (3)对应用了注解的类 进行反射操作的类




@Target(ElementType.TYPE)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MyDefAnnotation {
//定义变量
    public String name() default "vice";
    public int age() default 1;
    public String[] food();//定义数组
    public  EnumColor color();// 定义枚举



}
