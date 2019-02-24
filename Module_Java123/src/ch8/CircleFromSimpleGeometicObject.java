package ch8;

public class CircleFromSimpleGeometicObject extends  SimpleGeometircObject{
     private double radius;

    public CircleFromSimpleGeometicObject(double radius) {
        this.radius = radius;

    }
    public CircleFromSimpleGeometicObject(double radius, String color, boolean filled){
        super(color,filled);
        this.radius=radius;
//        setColor(color);
//        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //返回圆的面积
    public double getArea(){
        return  radius*radius*Math.PI;
    }

    //返回圆的直径
    public double getDiameter(){
        return  2*radius;
    }
    //返回圆的周长
    public  double getPerimeter(){
        return  2*radius*Math.PI;
    }


    public String printCircle() {
       return  "圆的半径是："+this.radius+"\n"
               +"圆的周长是：" +this.getPerimeter()+"\n"
                +"圆的面积是："+this.getArea()+"\n"
               +"圆的直径是："+this.getDiameter()+"\n"
               +"圆的颜色是:"+this.getColor();

    }

    public void mydefArea(CircleFromSimpleGeometicObject c,RectangleFromSimpleGeometricObject r){

        if(c.getArea()==r.getArea()){
            System.out.println("==");

        }
    }

}