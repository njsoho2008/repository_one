package cn.edu.javaprogram_edition10.ch13;




public class TestGeometricObject {
    public  static void  main(String[] args){
        GeometricObject o1=new Circle(5);
        GeometricObject o2=new Rectangle(5,7);

        equalArea(o1,o1);
        displayGeometricObject(o1);
        displayGeometricObject(o2);
    }

    public  static  boolean  equalArea(GeometricObject obj1,GeometricObject obj2){
         return  obj1.getArea()==obj2.getArea();


    }

    public  static void  displayGeometricObject(GeometricObject object){
        System.out.println();
        System.out.println("该图像的面积："+object.getArea());
        System.out.println("该图像的周长："+object.getPerimeter());

    }
}
