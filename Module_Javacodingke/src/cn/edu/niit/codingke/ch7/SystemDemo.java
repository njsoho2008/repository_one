package cn.edu.niit.codingke.ch7;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class SystemDemo {
    public static void main(String[] args){
        System.err.println("出错了");

        System.out.println( System.currentTimeMillis());
        Date now=new Date(System.currentTimeMillis());
        DateFormat df=new SimpleDateFormat("yyyy年mm月dd日  HH时mm分ss秒");
        System.out.println(df.format(now));

         int [] num1={1,2,3,4,5,6,7,8,9};

         int[] accept1=new int[num1.length];
         System.arraycopy(num1,0,accept1,0,num1.length);
         for (int i=0;i<accept1.length;i++)
         {
             System.out.print(num1[i]+",");
         }
         System.out.println();
         System.out.println(Arrays.toString(accept1));
         System.gc();
         //直接退出JVM
       //  System.exit(0);
        System.out.println(System.getProperties());

        Runtime rt=Runtime.getRuntime();
        System.out.println("当前处理器个数："+rt.availableProcessors());
        System.out.println("当前最大内存："+(rt.maxMemory()/8192)+"MB");
        System.out.println("当前空闲内存："+(rt.freeMemory()/8192)+"MB");
        System.out.println("当前总内存："+(rt.totalMemory()/8192)+"MB");
        //用exec命令打开其他应用程序
        try{
            rt.exec("C:\\Program Files (x86)\\2345Soft\\2345Pic\\2345Pic.exe");
        }catch (Exception e){
               e.printStackTrace();
        }
        //调用本地库如c语言库
        System.loadLibrary("11");
    }
}
