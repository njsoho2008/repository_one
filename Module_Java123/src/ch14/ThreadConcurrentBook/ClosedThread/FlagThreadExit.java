package ch14.ThreadConcurrentBook.ClosedThread;

import org.omg.CORBA.TIMEOUT;

import java.util.concurrent.TimeUnit;
/*volatile 变量来关闭线程

volatile 能保证
*
* */
public class FlagThreadExit {
    static class MyTask extends Thread{
//        volatile 关键字保证closed 线程是可见的
        private volatile  boolean closed=false;
        @Override
        public void run(){
            System.out.println("I will start work");
            while (!closed && !isInterrupted()){
                try {
                    TimeUnit.SECONDS.sleep(20);
                } catch (InterruptedException e) {
//                    e.printStackTrace();

                }
            }
            System.out.println("I will be exiting.");
        }
        public void close(){
            this.closed=true;
            this.interrupt();
        }
    }

    public static void main(String[] args) {
        MyTask t=new MyTask();
        t.start();
        try {
            TimeUnit.MILLISECONDS.sleep(400);
            System.out.println("系统将被关闭.");
            t.close();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
