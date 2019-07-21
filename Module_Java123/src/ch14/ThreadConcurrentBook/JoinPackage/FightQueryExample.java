package ch14.ThreadConcurrentBook.JoinPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class FightQueryExample {
    private static List<String> fightCompany = Arrays.asList("中国南方航空", "中国东方航空", "海南航空");

    public static void main(String[] args) {
        List<String> results = search("SH", "BJ");
        System.out.println("==============查询结果============");
        results.forEach(System.out::println);
    }

    private static List<String> search(String original, String dest) {

        final List<String> result = new ArrayList<>();
        List<FightQueryTask> tasks = fightCompany.stream().map(f -> createSearchTask(f, original, dest)).collect(toList());
//      //分别启动这几个线程
//        tasks.forEach(Thread::start);

        tasks.forEach(
             t->{

             }
        );

        tasks.stream().map(FightQueryTask::get).forEach(result::addAll);

        return result;
    }

    private static FightQueryTask createSearchTask(String fight, String original, String dest) {
        return new FightQueryTask(fight, original, dest);
    }
}
