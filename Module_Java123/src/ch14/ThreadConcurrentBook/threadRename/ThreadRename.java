package ch14.ThreadConcurrentBook.threadRename;

import java.util.stream.IntStream;

public class ThreadRename {
    private final static String PREFIX = "ALEX-";

    public static void main(String[] args) {
        IntStream.range(0, 5).mapToObj(ThreadRename::CreateThread2).forEach(Thread::start);

    }

    private static Thread CreateThread(final int intName) {
        return new Thread() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+PREFIX+intName);
            }

        };
    }

    private static Thread CreateThread2(final int intName) {
       return new Thread(()-> System.out.println(Thread.currentThread().getName()),PREFIX+intName);


    }

}
