package ch9;
//如果不实现接口中的方法，那么类需要定义为抽象类

abstract class Fruit implements Edible{
    //     要么不实现接口的方法；要么实现，并且方法体可以为空
    public String howToEat() {
        return null;
    }
}

class Apple extends Fruit{

    @Override
    public String howToEat() {
        return "切成片吃";
    }
}

class Orange extends Fruit{

    @Override
    public String howToEat() {
        return "剥皮吃";
    }
}
