package ch14.FirstCreateThreads;

public class MyThread_modify {
    static Thread thread = new Thread();

    public static void main(String[] args) {
        System.out.println("###主线程"+Thread.currentThread().getName());
        job1();
        new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"#");
                job2();

            }
        }.start();
        job3();
    }
    private static void job1() {
        for (int k=0;k<5 ;k++ ) {
            System.out.println("job1 is  doing ");
            try {
                thread.sleep(500);
                System.out.println(thread.getName());
                System.out.println("*1"+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }        }
    }
    private static void job2() {
        for (int k=0;k<5;k++ ) {
            System.out.println("job2 is  doing ");
            try {
                thread.sleep(500);
                System.out.println(thread.getName());
                System.out.println("*2"+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }        }
    }
    private static void job3() {
        for (int k=0;k<5;k++ ) {
            System.out.println("job3 is  doing ");
            try {
                thread.sleep(500);
                System.out.println(thread.getName());
                System.out.println("*3"+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
