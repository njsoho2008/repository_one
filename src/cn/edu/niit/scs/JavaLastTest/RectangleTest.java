package cn.edu.niit.scs.JavaLastTest;

public class RectangleTest extends Shape {
    private double width;
    private double height;

    public RectangleTest(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double CalCircumference() {
        return 2 * (this.width + this.height);
    }

    @Override
    public double CalSquare() {
        return this.width * this.height;
    }
}
