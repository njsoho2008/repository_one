package ch14.ThreadConcurrentBook.isinterrupted;

import java.util.concurrent.TimeUnit;

public class ThreadIsInterruptedModifed {
    public static void main(String[] args) throws Exception {
        System.out.println("主线程:" + Thread.currentThread().getName());
//        TimeUnit.MINUTES.sleep(2);

        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("子线程:" + Thread.currentThread().getName());
                while (true) {
                    try {
//                        可中断方法
                        TimeUnit.MINUTES.sleep(1);
                    } catch (InterruptedException e) {
//                        e.printStackTrace();
                        System.out.println("子线程本身 I am be interrupted? s%\n" + isInterrupted());
                    }
                }

            }
        };
//        thread.setDaemon(true);
        thread.start();
        System.out.println("??? 线程：" + Thread.currentThread().getName());
        //        主线程睡觉2毫秒的用意是让子线程有更多的时间去执行，确保能执行到sleep方法
        TimeUnit.MILLISECONDS.sleep(2);
        System.out.println("主线程  调用 子线程Thread is interrupted ？ %s \n" + thread.isInterrupted());
        thread.interrupt();
//        主线程睡觉2毫秒
        TimeUnit.MILLISECONDS.sleep(2);
        System.out.println("主线程调用 子线程Thread is interrupted? %s \n" + thread.isInterrupted());


    }
}
