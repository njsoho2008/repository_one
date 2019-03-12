package ch14;

public class MyThread {
    static Thread thread = new Thread();

    public static void main(String[] args) {
        job1();
        job2();
        job3();

    }


    private static void job1() {
        for (; ; ) {
            System.out.println("job1 is  doing ");
            try {
                thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private static void job2() {
        for (; ; ) {
            System.out.println("job2 is  doing ");
            try {
                thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


    private static void job3() {
        for (; ; ) {
            System.out.println("job3 is  doing ");
            try {
                thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
