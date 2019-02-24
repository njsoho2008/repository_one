package cn.edu.javaprogram_edition10.ch24;

public abstract class MyAbstractList<E> implements MyList<E>{
    protected  int size=0;

    protected MyAbstractList() {
    }
    protected MyAbstractList(E[] objects){
        for(int i=0;i<objects.length;i++){
            add(objects[i]);

        }

    }

    public void add(E e){
        add(e);

    }
}
