package ch9;

public class WithAbsRectangleDemo extends GeometircObject {
    private double height;
    private double width;

    public WithAbsRectangleDemo() {
        super();
    }
    public WithAbsRectangleDemo(double height, double width) {
        this.height = height;
        this.width = width;
    }
    public double getHeight() {
        return height;
}
    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.height*this.width;
    }

    @Override
    public double getPerimeter() {
        return 2*(this.height+this.width);
    }

    public String toString(){
        System.out.println("WithAbsRectangle");
        return  "WithAbsRectangle";
    }



}
