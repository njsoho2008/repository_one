package ch5;

//foreach 循环
public class ForEachDemo {
    public static void main(String[] args){

        int[] intarray={1,3,4,6,7,7,8,9,9,11,12};
        for (int k:intarray
             ) {
            System.out.println("数组的元素intarray["+k+"]="+(k+200));
        }

    }
}
