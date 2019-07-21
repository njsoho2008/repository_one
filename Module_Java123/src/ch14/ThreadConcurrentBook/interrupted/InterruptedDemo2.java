package ch14.ThreadConcurrentBook.interrupted;

import java.util.concurrent.TimeUnit;
//p47
public class InterruptedDemo2 {
    public static void main(String[] args) {
//        判断当前主线程是否中断
        System.out.println("Main thread is  interrupted? " + Thread.interrupted());
//        中断当前线程
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().interrupt();
//  判断当前线程是否已经被中断
        System.out.println("Main thread is interrupted?" + Thread.currentThread().isInterrupted());

        try {
//            当前线程执行可中断方法
            TimeUnit.MINUTES.sleep(1);
        } catch (InterruptedException e) {
            System.out.println("I will be interrupted still.");
        }

    }
}
