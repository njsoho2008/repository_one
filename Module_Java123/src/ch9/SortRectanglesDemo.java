package ch9;

import java.util.Arrays;

public class SortRectanglesDemo {
    public static void main(String[] args){
        WithAbsRectangleDemo[] rectangles={
                new WithAbsRectangleDemo(1,3),
                new WithAbsRectangleDemo(3,5),
                new WithAbsRectangleDemo(4,6),
                new WithAbsRectangleDemo(5,5)

        };
        Arrays.sort(rectangles);
        System.out.println("面积从大到小排列如下");
        for(WithAbsRectangleDemo rectangle:rectangles) {

            System.out.println(rectangle.getArea()+" ，"+"H:"+rectangle.getHeight()+","+"W:"+rectangle.getWidth());

        }
    }

}
