package ch8;

//多态与类型转换
public class CastingDemoPloymorphism {
    public static void main(String[] args) {
        Object object1 = new CircleFromSimpleGeometicObject(10);
        Object object2 = new RectangleFromSimpleGeometricObject(3, 4);
        displayObject(object1);
        displayObject(object2);


    }

    public static void displayObject(Object object) {
        if (object instanceof CircleFromSimpleGeometicObject) {
            System.out.println("圆的面积是" + ((CircleFromSimpleGeometicObject) object).getArea());
            System.out.println("圆的周长是" + ((CircleFromSimpleGeometicObject) object).getPerimeter());
        } else if (object instanceof RectangleFromSimpleGeometricObject) {
            System.out.println("矩形的面积是" + ((RectangleFromSimpleGeometricObject) object).getArea());

        }
    }
}
