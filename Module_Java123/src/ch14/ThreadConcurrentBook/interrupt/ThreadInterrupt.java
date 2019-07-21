package ch14.ThreadConcurrentBook.interrupt;

import java.util.concurrent.TimeUnit;
//p43
public class ThreadInterrupt {
    public static void main(String[] args) throws InterruptedException{
        System.out.println(""+Thread.currentThread().getName()+"线程启动了");
      /* Thread thread=new Thread(()->{
            try {
                long l1=System.currentTimeMillis();
                TimeUnit.MILLISECONDS.sleep(100);
                long l2=System.currentTimeMillis();
                System.out.println("l2-l1="+(l2-l1));
            } catch (InterruptedException e) {
                System.out.println("哦，我被中断了");
            }

        });*/

        Thread thread=new Thread(){
            @Override
            public void run(){
                try {
                    System.out.println(""+Thread.currentThread().getName()+"线程启动了");
                    long l1=System.currentTimeMillis();
//                    Thread-0 线程执行可中断方法sleep 100毫秒；如果在阻塞的100毫秒之间，主线程启动了
                    //thread.interrupt();这个语句，中断了sleep，那么该线程的interrupt flag标记反而会被清除

                    TimeUnit.MILLISECONDS.sleep(100);
                    long l2=System.currentTimeMillis();
                    System.out.println("l2-l1="+(l2-l1));
                } catch (InterruptedException e) {
                    System.out.println("thread.interrupt()被执行，触发InterruptedException异常抛出");
                }
            }
        };
        thread.setDaemon(true);
        thread.start();
        long l3=System.currentTimeMillis();
//        Thread-0 线程调用中断 ;线程的的flag标记被清理
        thread.interrupt();
//       主线程阻塞200毫秒
       TimeUnit.MILLISECONDS.sleep(200);
        long l4=System.currentTimeMillis();
        System.out.println("l4-l3="+(l4-l3));
        System.out.println("线程Thread-0被中断了？（true or false）"+thread.isInterrupted());


    }
}
