package ch14.ThreadConcurrentBook.JoinPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class ThreadJoin {
    public static void main(String[] args) {
//   1     定义2个线程，并且保存在threads中
        List<Thread> threads=IntStream.range(1,3).mapToObj(ThreadJoin::create).collect(toList());
//    2  启动线程
      threads.forEach(Thread::start);
//    3  执行这2个线程的join方法，线程1和线程2 相互阻塞
      for (Thread thread:threads){
          try {
              thread.join();
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
//    4  输出主线程的名字与循环编号
      for(int i=0;i<10;i++){
          System.out.println(Thread.currentThread().getName()+"#"+i);
          shortsleep();

      }

    }
//创建一个简单的线程，循环输出线程名+i的值
    private static Thread create(int seq){
        return new Thread(()->{
            for (int i=0;i<10;i++){
                System.out.println(Thread.currentThread().getName()+"#"+i);
                shortsleep();
            }
        },String.valueOf(seq));
    }
    private static void shortsleep(){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
