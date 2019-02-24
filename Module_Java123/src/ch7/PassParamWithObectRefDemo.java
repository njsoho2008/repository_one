package ch7;

//向方法传递对象引用
public class PassParamWithObectRefDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(10);

        swap1(circle1, circle2);
        System.out.println("After swap1:circle1=" + circle1.radius + "circle2=" + circle2.radius);
        swap2(circle1, circle2);
        System.out.println("After swap2:circle1=" + circle1.radius + "circle2=" + circle2.radius);

    }


    public static void swap1(Circle x, Circle y) {
        Circle ctemp = x;
        x = y;
        y = ctemp;
        System.out.println("swap1执行后："+"x.radius="+x.radius+"y.radius="+y.radius);

    }

    public static void swap2(Circle x, Circle y) {
        double temp = x.radius;
        x.radius = y.radius;
        y.radius = temp;

        System.out.println("swap2执行后："+"x.radius="+x.radius+"y.radius="+y.radius);


    }

}


class Circle {
    double radius;

    public Circle(double newradius) {
        this.radius = (newradius >= 0) ? newradius : 0;

    }
}
