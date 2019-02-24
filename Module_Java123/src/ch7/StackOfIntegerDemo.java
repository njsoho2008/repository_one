package ch7;

import java.util.Arrays;

public class StackOfIntegerDemo {
    private int[] elements;
    private  int size;
    public static final int DEFAULT_CAPACITY=16;
    public StackOfIntegerDemo(){
        this(DEFAULT_CAPACITY);
    }

    public StackOfIntegerDemo(int size) {
        elements=new int[size];
    }

    public void push(int value){
         int i=elements.length;
         if(size>i){
             int[] temp=new int[elements.length*2];
             System.arraycopy(elements,0,temp,0,elements.length);

             elements=temp;


         }
         elements[size++]=value;

    }

    public  void pushMethod2(int value){
        if(size>elements.length){
            elements=Arrays.copyOf(elements,elements.length*2);
        }
        elements[size++]=value;
    }
    //返回并且移走顶部的元素
    public int pop(){
        return  elements[--size];
    }
    //返回最顶部的元素
    public  int peek(){
        return  elements[size-1];

    }

    public  boolean empty(){
        return  size==0;
    }

    public int getSize(){
        return  size;
    }
}
