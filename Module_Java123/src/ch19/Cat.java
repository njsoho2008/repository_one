package ch19;


@MyDefAnnotation(food = {"黄鱼", "鲫鱼", "带鱼"}, color = EnumColor.BLACK)
public class Cat {
    private String name;
    private int age;
    private String food;
    private EnumColor color;

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name, int age, String food, EnumColor color) {
        this.name = name;
        this.age = age;
        this.food = food;
        this.color = color;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public EnumColor getColor() {
        return color;
    }

    public void setColor(EnumColor color) {
        this.color = color;
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
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", food='" + food + '\'' +
                ", color=" + color +
                '}';
    }

    @Deprecated
    public String printInfo() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
