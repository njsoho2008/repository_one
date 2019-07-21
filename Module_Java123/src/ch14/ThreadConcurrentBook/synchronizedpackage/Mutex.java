package ch14.ThreadConcurrentBook.synchronizedpackage;

import java.util.concurrent.TimeUnit;

public class Mutex {
    private final static Object MUTEX=new Object();
    private  int index=0;
    public static void  accessResouce(){
        synchronized (MUTEX){
            System.out.println(Thread.currentThread().getName());
            try {
                TimeUnit.MILLISECONDS.sleep(200);
                Thread.currentThread().interrupt();
                System.out.println(Thread.currentThread().isInterrupted());
                System.out.println("index="+(new Mutex().index++));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        final Mutex mutex=new Mutex();
        for(int i=0;i<10;i++){
//            new Thread(Mutex::accessResouce).start();

            new Thread(()->{
                accessResouce();
            }).start();
        }
    }
}
