package cn.edu.javaprogram_edition10.ch20;

import cn.edu.javaprogram_edition10.ch13.Circle;
import cn.edu.javaprogram_edition10.ch13.GeometricObject;
import cn.edu.javaprogram_edition10.ch13.Rectangle;

import java.util.Comparator;

public class TestComparator {
    public static void main(String[] args){
        GeometricObject geometricObject1=new Rectangle(4,5);
        GeometricObject geometricObject2=new Circle(5);

        GeometricObjectComparator geometricObjectComparator=new GeometricObjectComparator();
        int key=geometricObjectComparator.compare(geometricObject1,geometricObject2);

        System.out.println(key);

        GeometricObject g=max(geometricObject1,geometricObject2,geometricObjectComparator);
        System.out.println(g.toString()+"       它的面积是"+g.getArea());



    }
    //另外一种方式
    public static  GeometricObject max(GeometricObject g1, GeometricObject g2, Comparator<GeometricObject> comparator){
      if(comparator.compare(g1,g2)>0 )
          return g1;
      else
          return g2;


    }
}
