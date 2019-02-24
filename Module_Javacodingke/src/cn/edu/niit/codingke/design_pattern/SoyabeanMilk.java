package cn.edu.niit.codingke.design_pattern;

//具体的被装饰者
public class SoyabeanMilk implements  Drink {
    @Override
    public double cost() {
        return 10.0d;
    }

    @Override
    public String description() {
        return "我是纯豆浆，（一个具体的被装饰者类）";
    }
}
