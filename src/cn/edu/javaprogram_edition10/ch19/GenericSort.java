package cn.edu.javaprogram_edition10.ch19;

import java.util.SortedMap;

public class GenericSort {

    public static  void main(String[] args){
        Integer[] integers =new Integer[3];
        integers[0]=new Integer(2);
        integers[1]=new Integer(6);
        integers[2]=new Integer(9);


        Double[] doublesArray={new Double(3.4),new Double(5.9),new Double(8.8)};


        String[] StringArray={"Tom","Tick","Jhon"};
        sort(integers);
        sort(doublesArray);
        sort(StringArray);

        printList(integers);
        System.out.println("****************");
        printList(doublesArray);
        System.out.println("****************");
        printList(StringArray);


    }




    public  static <E extends  Comparable<E>> void sort(E[] list){
          E currentMin;
          int currentMinIndex;

          for(int i=0;i<list.length-1;i++){
              currentMin=list[i];
              currentMinIndex=i;
              for(int j=i+1;j<list.length;j++){
                  if(currentMin.compareTo(list[j])>0){
                  currentMin=list[j];
                  currentMinIndex=j;
                  }
              }
              //swap 操作
              if(currentMinIndex!=i){
                  list[currentMinIndex]=list[i];
                  list[i]=currentMin;
              }

          }

    }
    public static  void  printList(Object[] list){
        for(int i=0;i<list.length-1;i++){
             System.out.println(list[i]);
             System.out.println();
        }
    }


}
