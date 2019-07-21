package ch14.ThreadConcurrentBook.synchronizedpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//使用同步机制，向个账户中充值
public class AccountWithSync {
    private static Account account = new Account();

    private static class AddPennyTask implements Runnable {
        @Override
        public void run() {
            account.deposit(1);
        }
    }

    private static class Account {


        private int balance = 0;

        public int getBalance() {
            return balance;
        }
        public Account() {
        }

        //存钱
        public synchronized void deposit(int amount) {
            int newbalance = this.balance + amount;
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.balance = newbalance;
        }
    }

    public static void main(String[] args) {
//        创建线程池
        ExecutorService executor = Executors.newCachedThreadPool();
//        创建10个线程
        for (int i = 0; i < 10; i++) {
            executor.execute(new AddPennyTask());

        }
//        关闭线程池
        executor.shutdown();
//等待任务执行完成
        while (!executor.isTerminated()) {

        }
        System.out.println("what is balance?  " + account.getBalance());
    }
}
