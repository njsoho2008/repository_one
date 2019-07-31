package ch10;

import java.util.ArrayList;

public class MyStack {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();

    }

    //弹出最上面一个元素
    public Object pop() {

        Object o = list.get(getSize() - 1);
        list.remove(list.size() - 1);

        return o;
    }

    //取出最上层元素
    public  Object peek(){
        return  list.get(list.size()-1);
    }

    public void push(Object o){
        list.add(o);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
