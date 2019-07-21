package ch14.ThreadConcurrentBook.JoinPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class FightQueryTask implements Runnable,FightQuery {
    private final  String airline;
    private final  String origin;
    private final  String destination;
    private final List<String> flightList=new ArrayList<>();



    public FightQueryTask(String airline, String origin, String destination) {
         this.airline=airline;
        this.origin = origin;
        this.destination = destination;
    }

    @Override
    public void run() {
        System.out.printf("%s -query from %s to %s \n",Thread.currentThread().getName(),origin,destination);
        int randomval=ThreadLocalRandom.current().nextInt(10);
        try {
            TimeUnit.SECONDS.sleep(randomval);
            this.flightList.add(Thread.currentThread().getName()+"-"+randomval);
            System.out.println("The Fight:%s list query successful \n"+Thread.currentThread().getName());
        } catch (InterruptedException e) {
//            e.printStackTrace();
        }

    }

    @Override
    public List<String> get() {
        return this.flightList;
    }
}
