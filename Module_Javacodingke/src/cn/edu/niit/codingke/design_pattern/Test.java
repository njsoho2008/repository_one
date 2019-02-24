package cn.edu.niit.codingke.design_pattern;

public class Test {
    public  static void main(String[] args){
        Drink drink=new SoyabeanMilk();
        SugarDecorator sugar=new SugarDecorator(drink);
        BlackBeanDecorator blackBean=new BlackBeanDecorator(sugar);
        EggsDecorator eggs=new EggsDecorator(blackBean);
        System.out.println(eggs.description()+"，加了这么多配料之后的价格是："+eggs.cost()+"元");




    }
}
