package ch14.ThreadConcurrentBook.lockpackage;

import java.util.LinkedList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConsumerProducer {
    private static Buffer buffer = new Buffer();
    private  static class ProducerTask implements Runnable{

        @Override
        public void run() {
            try{
                int i=1;
                while (true){
                    System.out.println("Produce writes"+i);
                    buffer.write(i++);
                    Thread.sleep((int)(Math.random()*1000));
                }
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
    private static class ConsumerTask implements Runnable{

        @Override
        public void run() {
            while (true){
                System.out.println("\t\t\tConsumer reads"+buffer.read());
                try {
                    Thread.sleep((int)(Math.random()*1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private static class Buffer {
        private static final int CAPACITY = 1;
        private LinkedList<Integer> queue = new LinkedList<>();
        //        创建锁
        private static Lock lock = new ReentrantLock();
        //        创建2个条件
        private static Condition notEmpty = lock.newCondition();
        private static Condition notFull = lock.newCondition();

        public void write(int value) {
            lock.lock();
            try {
                while (queue.size() == CAPACITY) {
                    System.out.println("wait for notFull condition");
                    notFull.await();
                }
                queue.offer(value);
                notEmpty.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }

        public int read() {
            int value = 0;
            lock.lock();
            try {
                while (queue.isEmpty()) {
                    System.out.println("\t\t\t\t wait for notEmpty condition");

                    notEmpty.wait();


                }
                value = queue.remove();
                notFull.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
                return value;
            }

        }
    }

    public static void main(String[] args){
        ExecutorService executors=Executors.newFixedThreadPool(2);
        executors.execute(new ProducerTask());
        executors.execute(new ConsumerTask());
        executors.shutdown();
    }

}
