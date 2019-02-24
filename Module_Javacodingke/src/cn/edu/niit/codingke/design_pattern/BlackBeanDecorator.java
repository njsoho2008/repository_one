package cn.edu.niit.codingke.design_pattern;

public class BlackBeanDecorator extends  DecoratorBased {
    public BlackBeanDecorator(Drink drink) {
        super(drink);
    }
@Override
    public  double cost(){
        return  super.cost()+2d;

    }

    @Override
    public String description() {
        return super.description()+"加黑豆的";
    }
}
