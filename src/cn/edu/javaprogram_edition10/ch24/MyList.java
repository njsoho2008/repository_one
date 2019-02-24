package cn.edu.javaprogram_edition10.ch24;

public interface MyList<E> extends Iterable<E> {
    /*在list尾部添加 元素e*/
    public void add(E e);

    public void add(int index, E e);

    /*清空list*/
    public void clear();

    public boolean contains(E e);

    public E get(int index);

    public Object set(int index,E e);

//返回元素e第一次在list中出现的位置

    public int  indexof(E e);

    public boolean isEmpty();

    public int lastIndexOf(E e);

    public  boolean remove(E e);

    public  int size();



}
