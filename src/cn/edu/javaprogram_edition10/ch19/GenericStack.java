package cn.edu.javaprogram_edition10.ch19;
import  java.util.ArrayList;
public class GenericStack<E> {
    //Arraylist是一个可变长度的list
    private ArrayList<E> arraylist=new ArrayList<>();

    public  GenericStack(){

    }

//返回栈的大小
    public  int getSize(){
        return  arraylist.size();
    }
  //返回栈顶的元素并删除
    public E pop(){
        E  e=arraylist.get(getSize()-1);
        arraylist.remove(getSize()-1);
        return  e;

    }
    //返回栈顶的元素
    public  E peek(){
        E  e=this.arraylist.get(getSize()-1);
        return  e;
    }
    //向栈顶压入一个元素

    public void push(E o){

        arraylist.add(o);

    }

    public  boolean isEmpty(){
        /*if(this.arraylist.size()==0){
            return  true;
        }*/
        return  arraylist.isEmpty();
    }




}
