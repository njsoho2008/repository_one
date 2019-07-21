package ch14.FirstCreateThreads;

public class MyThread {
    static Thread thread = new Thread();

    public static void main(String[] args) {
        System.out.println("###主线程="+Thread.currentThread().getName());
        job1();
        job2();
        job3();
    }
    private static void job1() {
        while (true) {

            System.out.println("job1 is  doing ");
            try {
                thread.sleep(500);
                System.out.println(thread.getName());
                System.out.println("***"+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private static void job2() {
        for (; ; ) {
            System.out.println("job2 is  doing ");
            try {
                thread.sleep(500);
                System.out.println(thread.getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }        }
    }
    private static void job3() {
        for (; ; ) {
            System.out.println("job3 is  doing ");
            try {
                thread.sleep(500);
                System.out.println(thread.getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
