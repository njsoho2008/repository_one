package ch7;

public class TestCircle {
    public static void main(String[] args){

        System.out.println(SimpleCircle.str);

        SimpleCircle circle1=new SimpleCircle();

        System.out.println(circle1.radius);
        System.out.println(circle1.str);


        System.out.println(circle1.getArea(circle1.getRadius()));

        SimpleCircle circle2=new SimpleCircle(10);

        System.out.println(circle2.getArea(circle2.getRadius()));

    }
}
