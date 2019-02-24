package ch5;

public class DefineArrayDemo {
    public static  void main(String[] args){
        int[] intarray={1,2,4,5,8}; //method1 最常用
        int[] intarray2;
        intarray2=new int[35];   //method2

        int[] intarray3=new int[10];  //method3

        int[] intarray4=new int[]{1,2,3,4,6,7,8};

        //给学生赋予学号
        for(int i=0;i<35;i++){
            System.out.println("N2018031"+(intarray2[i]=i));

        }



    }
}
