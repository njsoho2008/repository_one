package cn.edu.niit.codingke.design_pattern;
/*
* 具体的装饰者类，然后重写cost(),description()
* */
public class SugarDecorator extends DecoratorBased {
    public SugarDecorator(Drink drink) {
        super(drink);
    }
@Override
  public   double cost(){
        return  super.cost()+1.0d;

    }
    @Override
    public  String description(){
      return  super.description()+"加糖的";
    }
}
