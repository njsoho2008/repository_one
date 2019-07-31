package ch9.p_interface;

public abstract class Animal {
    public abstract String sound();
}

class Chicken extends Animal implements Edible {
    private String name;

    public Chicken() {
        this.name = "小鸡";
    }

    public String getName() {
        return name;
    }

    @Override
    public String sound() {
        return "咯咯咯叫";
    }

    @Override
    public String howToEat() {
        return "烤鸡翅等";
    }
}

class Tiger extends Animal {
    private String name;

    public Tiger() {
        this.name = "老虎";
    }

    public String getName() {
        return name;
    }

    @Override
    public String sound() {
        return "aoaoao";
    }


}




