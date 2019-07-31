package ch9;
/*
* 学习使用comparable 接口,String类 和BigInteger类实现了Comparable接口
* */
import java.math.BigInteger;
import java.util.Arrays;

public class SortComparableObjects {

    public static void main(String[] args){

        String[] cities={"北京","南京","上海","杭州","南通","绍兴"};
        Arrays.sort(cities);
        for(String city:cities){
            System.out.print(city+">");

        }
        System.out.println();
        BigInteger[] bigIntegers={new BigInteger("23232526698"),new BigInteger("4444444448"),
        new BigInteger("723232322")};
        Arrays.sort(bigIntegers);
        for(BigInteger bigInteger:bigIntegers){
            System.out.print(bigInteger+">");
        }
    }


}
