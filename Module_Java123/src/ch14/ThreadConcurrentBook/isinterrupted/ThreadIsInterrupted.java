package ch14.ThreadConcurrentBook.isinterrupted;

import java.util.concurrent.TimeUnit;
/*
* isInterrupted() 方法仅仅是对interrupt标识符的一个判断，不会影响标识符的改变，和interrupted()
* 方法不同，interrupted()会擦掉interrupt标识符
*
* */
public class ThreadIsInterrupted {
    public static void main(String[] args)throws Exception {
        Thread thread = new Thread() {
            @Override
            public void run() {
                while (true) {
//                    什么也不做，没有可中断方法
                }

            }
        };
//        thread.setDaemon(true);
        thread.start();
        TimeUnit.MILLISECONDS.sleep(2);
        System.out.println("01-Thread is interrupted ？ %s \n"+thread.isInterrupted());
        thread.interrupt();
        System.out.println("02-Thread is interrupted? %s \n"+thread.isInterrupted());


    }
}
