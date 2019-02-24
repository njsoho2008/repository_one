package cn.edu.niit.codingke.ch7;

/**
 * 要想具备克隆条件
 * 1.实现cloneable 接口  该接口是个标记接口，里面没有任何方法可以实现
 *  重写Object类的clone方法
 *
 */

public class CloneableCat implements Cloneable{
    private String name;
    private  int age;

    public CloneableCat() {
    }

    public CloneableCat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "CloneableCat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //重写克隆方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();

    }
}
