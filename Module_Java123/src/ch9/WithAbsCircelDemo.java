package ch9;

public class WithAbsCircelDemo extends GeometircObject implements Comparable<WithAbsCircelDemo>, Cloneable {
    private double radius;

    public WithAbsCircelDemo() {
        super();
    }


    public WithAbsCircelDemo(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        System.out.println("AbsCircleDmeo");
        return "AbsCircleDmeo";
    }

   @Override
    public int compareTo(WithAbsCircelDemo o) {
        if (this.getArea() > o.getArea())
            return -1;
        else
            return 0;

    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }

    }



}
