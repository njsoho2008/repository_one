package ch9;

public class TestCloneableWithAbsCircleDemo {
    public static void main(String[] args){

        WithAbsCircelDemo circle=new WithAbsCircelDemo(7);
        System.out.println("circle的面积是"+circle.getArea());
        WithAbsCircelDemo circle1=(WithAbsCircelDemo) circle.clone();

        System.out.println("circle1的面积是"+circle1.getArea());


        if(circle instanceof WithAbsCircelDemo){
            System.out.println("circle是 WithAbsCircelDemo 的一个实例");
        }

        if(circle1 instanceof WithAbsCircelDemo){
            System.out.println("circle1是 WithAbsCircelDemo 的一个实例");
        }

      /* if(circle1 instanceof circle){
            System.out.println("circle1是 circle 的一个实例？");
        }*/



    }


}
