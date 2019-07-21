package ch14.quhaoji;

import java.util.concurrent.TimeUnit;

public class TickWindowRunnable implements Runnable {
    private  static int index=1;
    private final static int MAX=50;
    @Override
    public void run() {
        while (index<=MAX){
            System.out.println(Thread.currentThread()+"的号码是："+(index++));
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }        }

    public static void main(String[] args) {
        final TickWindowRunnable task=new TickWindowRunnable();
        Thread thread1=new Thread(task,"一号窗");
        Thread thread2=new Thread(task,"二号窗");
        Thread thread3=new Thread(task,"三号窗");
        Thread thread4=new Thread(task,"四号窗");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
    }

