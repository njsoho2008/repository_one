package ch10;


/*
<E extends GenericObject>  类型受限制的泛型  这样的泛型成为受限制的(Bounded)
*
*
* */

import ch9.GeometircObject;
import ch9.WithAbsCircelDemo;
import ch9.WithAbsRectangleDemo;

public class LimitedTypeDemo {

   public static void main(String[] args){
       WithAbsRectangleDemo rectangle=new WithAbsRectangleDemo(2,8);
       WithAbsCircelDemo circle=new WithAbsCircelDemo(6);
       System.out.println("矩形和圆形的面积相等吗？"+(equalArea(rectangle,circle)?"相等":"不相等"));
   }



    public static <E extends GeometircObject> boolean equalArea(E obj1,E obj2){
        return  (obj1.getArea()==obj2.getArea());
    }

}
