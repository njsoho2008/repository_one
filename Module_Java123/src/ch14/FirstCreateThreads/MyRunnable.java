package ch14.FirstCreateThreads;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("执行MyRunnable 中的run....");
    }
}

class UseMyRunnable{
    public static void main(String[] args){
        MyRunnable myRunnable=new MyRunnable();
        Thread thread=new Thread(myRunnable);
        thread.start();

//以下写法不推荐，因为将任务（run的执行体）和任务的执行机制（Thread机制）混合在一起了
        Thread thread1=new Thread(){
            @Override
            public void run(){
                System.out.println("开启一个新的线程，执行打印工作.....");

                Thread.yield();
            }

        };
        thread1.start();

    }

}
