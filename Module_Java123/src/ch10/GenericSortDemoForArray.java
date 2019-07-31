package ch10;

import ch9.WithAbsRectangleDemo;

import java.util.Arrays;

//对各种类型的数组进行排序
//通用

//受到限制的泛型

/*
<E extends GenericObject>  类型受限制的泛型  这样的泛型成为受限制的(Bounded)
*
*
* */
public class GenericSortDemoForArray {

    public static void main(String[] args){
        String[] str={"shanghai","hefei","fujiang","nantong","zhenzhou"};
        Character[] chars={'J','Q','Y','P','L'};
        int[] ints={4,77,99,101};
        double[] doubles0={4.9,5,9,11.2};
        Integer[] integers={new Integer(4),new Integer(77),
                new Integer(99)};
        WithAbsRectangleDemo[] rectangle={new WithAbsRectangleDemo(2,5),
                new WithAbsRectangleDemo(5,9)};
       Double[] doubles={new WithAbsRectangleDemo(2,5).getArea(),
               new WithAbsRectangleDemo(6,8).getArea()};
        sort(str);
        sort(chars);
//        sort(ints);
        sort(integers);
        Arrays.sort(ints);
        Arrays.sort(integers);
        Arrays.sort(doubles0);
        sort(rectangle);
        print(str);
        print(chars);
        print(integers);
        print(rectangle);
        print(doubles);

    }
//定义泛型方法

    public static <E extends Comparable> void sort(E[] list){
        E currentMin;
        int currentMinIndex;
        for(int i=0;i<list.length;i++){
            currentMin=list[i];
            currentMinIndex=i;
            for(int j=i+1;j<list.length;j++){
                if(currentMin.compareTo(list[j])>0){
                    currentMin=list[j];
                    currentMinIndex=j;
                }
            }
//            swap
            if(currentMinIndex!=i){
                list[currentMinIndex]=list[i];
                list[i]=currentMin;

            }

        }

    }
    public static <E> void print(E[] list){
        for(int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");

        }
        System.out.println();
    }
}
