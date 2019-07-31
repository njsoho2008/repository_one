package ch10;

import java.util.ArrayList;

public class GenericStack<E> {
    private  java.util.ArrayList<E> list=new ArrayList<>();
    public int getSize(){
        return  list.size();
    }
//    返回最上层的元素
    public E peek(){
        return list.get(list.size()-1);
    }

//    弹出去最上面一个元素
    public E pop(){
        E o=list.get(getSize()-1);
        list.remove(list.size()-1);
        return  o;

    }

    public void push(E o){
      list.add(o);
    }

    public boolean isEmpty(){
        return  list.isEmpty();
    }

    @Override
    public  String toString(){
        return  "stack:"+list.toString();
    }



}
