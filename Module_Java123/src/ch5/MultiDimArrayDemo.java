package ch5;

import java.util.Scanner;

//查找距离最近的点
public class MultiDimArrayDemo {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("输入点数的数量");

        int numberOfPoionts=input.nextInt();
        double[][] points=new double[numberOfPoionts][2];
        System.out.print("输入"+numberOfPoionts+"points:");
        for(int i=0;i<points.length;i++){
            points[i][0]=input.nextDouble();
            points[i][1]=input.nextDouble();
        }
        //计算2个点之间的距离
        int p1=0,p2=1;
        double shortestDistance=distance(points[p1][0],points[p1][1],points[p2][0],points[p2][1]);

        for(int i=0;i<points.length;i++){
            for(int j=i+1;j<points.length;j++){
                 double distance=distance(points[i][0],points[i][1],points[j][0],points[j][1]);
                 if(shortestDistance>distance){
                       p1=i;
                       p2=j;
                       shortestDistance=distance;
                 }

            }

        }
        System.out.println("最近的2点是："+"("+points[p1][0]+","+points[p1][1]+") 和("+points[p2][0]+","+points[p2][1]+")");
        System.out.println(points[0].length);
    }

    public static double distance(double x1,double y1,double x2,double y2){
        return  Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));

    }
}
