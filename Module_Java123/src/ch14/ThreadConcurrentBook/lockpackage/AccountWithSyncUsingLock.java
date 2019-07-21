package ch14.ThreadConcurrentBook.lockpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//使用同步和锁
public class AccountWithSyncUsingLock {
    private static Account account=new Account();
    private static class AddPennyTask implements Runnable{
        @Override
        public void run() {
            account.deposit(1);
        }
    }
    private static class Account {
        private static Lock lock=new ReentrantLock();
        private int balance = 0;

        public Account() {
        }
        public int getBalance() {
            return balance;
        }
        public void deposit(int amount) {
            lock.lock();
            int newbalance = this.balance + amount;
            try {
                Thread.sleep(5);
                this.balance=newbalance;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args){
//        创建线程池
        ExecutorService executor=Executors.newCachedThreadPool();
//        创建100个线程
        for(int i=0;i<100;i++){
            executor.execute(new AddPennyTask());

        }
//        关闭线程池
        executor.shutdown();

        while (!executor.isTerminated()){

        }
        System.out.println("what is balance?"+account.getBalance());
    }
}
