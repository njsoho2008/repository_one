package cn.edu.javaprogram_edition10.ch20;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriortyQueueDemo {
    public static  void main(String[] args){
        PriorityQueue<String> pQueue=new PriorityQueue<>();
        pQueue.offer("Oklahoma");
        pQueue.offer("Indiana");
        pQueue.offer("Georgia");
        pQueue.offer("Texas");

        System.out.println("优先队列 使用了 Comparable 接口");
        while (pQueue.size()>0)
        {
            System.out.print(pQueue.remove()+"  ");
        }

        PriorityQueue<String> pQueue2=new PriorityQueue<>(4,Collections.reverseOrder());
        pQueue2.offer("Oklahoma");
        pQueue2.offer("Indiana");
        pQueue2.offer("Georgia");
        pQueue2.offer("Texas");

        System.out.print("\n");

        System.out.println("优先队列 使用了 Comparator 接口");
        while (pQueue2.size()>0)
        {
            System.out.print(pQueue2.remove()+"  ");
        }

    }
}
