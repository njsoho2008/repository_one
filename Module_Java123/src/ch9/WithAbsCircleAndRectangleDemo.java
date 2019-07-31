package ch9;

//多态
public class WithAbsCircleAndRectangleDemo {


    public static void main(String[] args) {
        GeometircObject object1 = new WithAbsCircelDemo(10);
        GeometircObject object2 = new WithAbsRectangleDemo(4, 5);

        Boolean flag = equalArea(object1, object2);
        if (!flag) {
            System.out.println("2个图形面积不相等");
        }
        displayGeometriObject(object1);
        object1.toString();
        displayGeometriObject(object2);
        object2.toString();


    }
//抽象类的好处
    public static boolean equalArea(GeometircObject object1, GeometircObject object2) {
        return object1.getArea() == object2.getArea();

    }

    public static void displayGeometriObject(GeometircObject object) {
        System.out.println();
        System.out.println("面积是：" + object.getArea());
        System.out.println("周长是" + object.getPerimeter());

    }
}
