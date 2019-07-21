package ch14.ThreadConcurrentBook.synchronizedpackage;

public class TickWindowRunnable_synchronized implements Runnable {
    private int index=0;
    private final static int MAX=50;
    private final static Object Mutex=new Object();

    @Override
    public void run() {
        synchronized(Mutex) {
            while (index<=MAX) {
                System.out.println(Thread.currentThread().getName() + "的号码是" + (index++));

            }
        }
    }

    public static void main(String[] args) {
        final TickWindowRunnable_synchronized task=new TickWindowRunnable_synchronized();
        Thread windowThread1=new Thread(task,"一号窗口");
        Thread windowThread2=new Thread(task,"二号窗口");
        Thread windowThread3=new Thread(task,"三号窗口");
        Thread windowThread4=new Thread(task,"四号窗口");
        windowThread1.start();
        windowThread2.start();
        windowThread3.start();
        windowThread4.start();
    }
}
