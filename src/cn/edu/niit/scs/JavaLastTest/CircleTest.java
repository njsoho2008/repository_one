package cn.edu.niit.scs.JavaLastTest;

public class CircleTest extends Shape {
    private  double radius;

    public CircleTest(double radius) {
        this.radius = radius;
    }

    @Override
    public double CalCircumference() {
        return 2*Math.PI*this.radius;
    }

    @Override
    public double CalSquare() {
        return Math.PI*this.radius*this.radius;
    }
}
