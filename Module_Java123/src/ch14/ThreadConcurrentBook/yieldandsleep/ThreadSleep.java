package ch14.ThreadConcurrentBook.yieldandsleep;

import java.util.concurrent.TimeUnit;

public class ThreadSleep {
    public static void main(String[] args) {
        new Thread(){

        };
        new Thread(()->{
            long startTime=System.currentTimeMillis();
                sleep(2_000L);
            long endTime=System.currentTimeMillis();
            System.out.println(String.format("Total spend %d ms",(endTime-startTime)));
        }).start();

        long startTime=System.currentTimeMillis();
        sleep(3_000L);
        long endTime=System.currentTimeMillis();
        System.out.println(String.format("Main Thread Total spend %d ms",(endTime-startTime)));
    }

    private static void sleep(long ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
