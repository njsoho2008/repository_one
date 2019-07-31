package ch9;

import java.io.Serializable;
import java.util.Comparator;

public class GeometricObjectComparator implements Comparator<GeometircObject>, Serializable {
    @Override
    public int compare(GeometircObject o1, GeometircObject o2) {
        if (o1.getArea() > o2.getArea())
            return 1;
        else if (o1.getArea() < o2.getArea())
            return -1;
        else
            return 0;
    }


    public static GeometircObject max(GeometircObject g1,GeometircObject g2,GeometricObjectComparator c){
        if(c.compare(g1,g2)>0)
            return g1;
        else
            return g2;

    }

    public static void main(String[] args){
        GeometircObject g1=new WithAbsCircelDemo(4);
        GeometircObject g2=new WithAbsRectangleDemo(6,9);
        GeometricObjectComparator c=new GeometricObjectComparator();
         GeometircObject geo=max(g1,g2,c);
         System.out.println(geo.toString());
    }
}
