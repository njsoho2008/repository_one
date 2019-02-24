package cn.edu.javaprogram_edition10.ch30;

import java.util.Date;

public class Test {

        private  static int p;
        public String str="";
        public String str2;
        public Test(){
            this(0);
        }
        public Test(int p){
            this.p=p;
        }

        private static void doWhile(){
            int count=0;
            do{
                System.out.println("count="+count);
            }while(count++<10);
            System.out.println(count);
            char x = 'a';  char y = 'd';
            System.out.println(x - y);
        }
        public static void main(String[] args){
            Date[] dates=new Date[10];
            for(int i=0;i<dates.length;i++){
                dates[i]=new Date();
                System.out.println("今天是几号啊？"+dates[i].getDate());
            }
            Test t=new Test();
            System.out.println("**"+t.str2);
            Test.doWhile();
            System.out.println(System.currentTimeMillis());

        }
    }

/**/