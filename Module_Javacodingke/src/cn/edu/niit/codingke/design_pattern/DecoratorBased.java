package cn.edu.niit.codingke.design_pattern;

//装饰者的基类，基类建议用抽象类，他也必须实现Drink 接口

public abstract class DecoratorBased implements Drink {
    private Drink drink;//引入要装饰的内容(就是具体的装饰内容、行为)
    public DecoratorBased(Drink drink) {
        this.drink=drink;
    }

    @Override
    public double cost() {
        return drink.cost();
    }

    @Override
    public String description() {
        return drink.description();
    }
}
