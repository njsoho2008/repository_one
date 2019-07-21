package ch14.ThreadSync;

public class TaskThreadDemo {
    public static void main(String[] args) {
        Runnable printA = new PrintChar('a', 30);
        Runnable printB = new PrintChar('b', 30);
        Runnable printC = new PrintNum(30);
// 通过 Thread 构建一个实现Runnable接口的任务 即启动了一个新线程
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(printC);


        thread1.start();
        System.out.println("\n after thread1 ....................");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n before thread2 ....................");
        thread2.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread3.start();
    }
}

//
class PrintChar implements Runnable {

    private char charToPoint;
    private int times;

    public PrintChar(char ch, int i) {
        this.charToPoint = ch;
        this.times = i;

    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.print("i=" + i + charToPoint + " ");
            if (i % 15 == 0) {
                System.out.println();
            }

        }

    }
}

class PrintNum implements Runnable {
    private int lastNum;

    public PrintNum(int i) {
        this.lastNum = i;
    }

    @Override
    public void run() {

        Thread thread4 = new Thread(new PrintChar('c', 30));
        thread4.start();
        for (int j = 0; j < lastNum; j++) {
            System.out.println("执行printNum Thead and print " + j);
            if (j == 50) {
                // 使用join()使得一个线程等待另一个线程的结束
                try {
                    thread4.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }


    }
}


