package cn.edu.niit.codingke.ch5;
//在单线程的情况下，StringBuilder 效能优越于StringBuffer,但是不是线程安全的

public class MyStringBuilderDemo {
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer(23);
        sb.append('r');
        sb.append(3.33).append("ddd").append(55);


    }
}
