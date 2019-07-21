package ch14.ThreadConcurrentBook;

import java.util.concurrent.TimeUnit;

public class ThreadPriority {
    public static void main(String[] args) {
        ThreadGroup threadGroup=new ThreadGroup("Test1");
        threadGroup.setMaxPriority(7);
        Thread thread= new Thread(threadGroup,"test-thread");
        thread.setPriority(10);
        System.out.println(thread.getPriority());

        Thread thread1=new Thread(()->{
            while (true) {
                System.out.println("t1");
            } });
        thread1.setPriority(3);
        Thread thread2=new Thread(()->{
            while (true){
                System.out.println("t2");
            }
        });
        thread2.setPriority(10);
        thread1.start();
        thread2.start();
        try {
            TimeUnit.SECONDS.sleep(3);
            thread2.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
