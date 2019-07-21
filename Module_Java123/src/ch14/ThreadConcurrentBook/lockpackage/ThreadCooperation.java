package ch14.ThreadConcurrentBook.lockpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//  存钱  取现
public class ThreadCooperation {
    private static Account account = new Account();
//存钱
    private static class DepositTask implements Runnable {

        @Override
        public void run() {
            try {

                while (true) {
                    account.deposit((int) (Math.random() * 10) + 1);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
//取钱
    private static class WithdrawTask implements Runnable {

        @Override
        public void run() {
            while (true) {
                account.withdraw((int) (Math.random() * 10) + 1);
            }
        }
    }

    private static class Account {
        private static Lock lock = new ReentrantLock();
        private static Condition newDeposit = lock.newCondition();
        private int balance = 0;

        public Account() {
        }

        public int getBalance() {
            return balance;

        }

        //        取钱
        public void withdraw(int amount) {
            lock.lock();
            try {
                while (balance < amount) {
                    System.out.println("\t\t\t\t 余额不足，等待存款汇入");
        //通知当前线程进入等待状态
                    newDeposit.await();
                }
                balance = balance - amount;
                System.out.println("\t\t\t 取款" + amount + "余额" + this.getBalance());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        }


        //存钱
        public void deposit(int amount) {
            lock.lock();
            try {
                int newbalance = this.balance + amount;


                this.balance = newbalance;
                System.out.println("Deposit" + amount + "\t\t\t\t\t" + this.getBalance());
//                通知所有等待的线程
                newDeposit.signalAll();
            } finally {
                lock.unlock();
            }


        }
    }


    public static void main(String[] args) {
//        创建线程池
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new DepositTask());
        executor.execute(new WithdrawTask());
//        关闭线程池
        executor.shutdown();


    }
}
