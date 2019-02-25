package ch8;

//向栈中填压对象

import java.util.ArrayList;

public class MyStack {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void push(Object o) {
        list.add(o);
    }

    public int getSize() {
        return list.size();
    }
//返回栈顶层元素
    public Object peek() {
        return list.get(getSize() - 1);

    }

    //弹出去最上面的元素，栈的元素少1
    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;

    }
}
