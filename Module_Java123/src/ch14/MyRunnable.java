package ch14;

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


        Thread thread1=new Thread(){
            public void run(){
                System.out.println("开启一个新的线程，执行打印工作.....");
            }

        };
        thread1.start();

    }

}
