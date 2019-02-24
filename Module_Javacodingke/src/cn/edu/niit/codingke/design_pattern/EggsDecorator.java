package cn.edu.niit.codingke.design_pattern;

public class EggsDecorator extends DecoratorBased {
    public EggsDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public double cost() {
        return super.cost()+1d;
    }

    @Override
    public String description() {
        return super.description()+"加鸡蛋的";
    }
}
