package cn.edu.niit.codingke.ch9;

import java.util.Vector;
/*
* 1Vector 的容量会自动扩容,当容量等于0时，扩充为原来的2倍，当容量>0时，扩充为原来的1倍
* 2.默认大小为10的对象数组
* 3.不适合删除和插入操作
* 4.线程安全的，适合多线程的环境使用，单线程环境下效率低
* 5.为了防止扩充次数过多，建议初始化是，限定Vector的容量
* */

public class VectorDemo {
    public static void vectorMethod(){
        Vector<String> v=new Vector<>();

        v.add("苍井空");
        v.add("苍老师");
        v.add("日语");
        v.add("语文");
        int size=v.size();
        for(int i=0;i<size;i++){
            System.out.println(v.get(i));
        }
    }

    public static void main(String[] args){
        vectorMethod();


    }
}
