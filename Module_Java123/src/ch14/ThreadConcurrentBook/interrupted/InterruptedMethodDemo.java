package ch14.ThreadConcurrentBook.interrupted;



import java.util.concurrent.TimeUnit;

/*
默认情况下一个线程内部都有一个名为interrupt flag的 标识，
如果一个可中断的线程被interrupt了，那个标识反而会消失

* interrupted() 方法 调用之后会擦除掉线程的interrupt标识，需要第一次调用返回true
* 第二次以后的调用会返回false；除非在此期间线程再次被打断
*
*interrupted() 方法
* p45
*
* */
public class InterruptedMethodDemo {
    public static void main(String[] args) {
        System.out.println("1主线程？"+Thread.currentThread().getName());
      Thread thread=new Thread(){
          @Override
        public void  run(){
//              因为不想受到中断方法的影响，因此没有在run方法中添加休眠
              System.out.println(Thread.currentThread().getName());
            while (true){

                System.out.println("-----");
//                非常重要，调用一次interrupted()方法以后【注意不是interrupt()方法】，线程的flag标识会被清除，因此第一结果为true之后，
//                后面的结果全部是false；
//                isInterrupted()方法不会改变标识flag；只是根据flag 给出布尔结果
                System.out.println(Thread.currentThread().isInterrupted()+"/"+Thread.interrupted());
            }
        }
      };
//设置为守护线程 ,也可以称为后台线程，在希望某些线程关闭或者退出JVM进程的时候，一些线程能够关闭
//        则把这些线程设置为守护线程
      thread.setDaemon(true);
      thread.start();
//      调用interrupt()方法,则会给线程设置一个中断标识，如果线程正在执行可中断方法被阻塞，比如sleep；调用interrupt
//        方法会导致中断标识被清除；
      thread.interrupt();
//      shortly block make sure the thread is started  ***

//        Thread.currentThread().interrupt();
        try {
            System.out.println("2主线程？"+Thread.currentThread().getName());
//           //主线程睡觉100毫秒 ，确保子线程Thread-0可以被启动执行
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("主线程被interrupt");
        }
        System.out.println("主线程执行到此结束");


    }

}
