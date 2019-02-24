package cn.edu.javaprogram_edition10.ch30;

public class TaskThreadDemo {
   public static void main(String[] args){
       Runnable printA=new PrintChar('a',100);
       Runnable printB=new PrintChar('b',100);
       Runnable printNum=new PrintNum(100);

       Thread thread1=new Thread(printA);
       Thread thread2=new Thread(printB);
       Thread thread3=new Thread(printNum);

       thread1.start();
       thread2.start();
       thread3.start();

   }

}

class PrintChar implements Runnable{
    private char cToPrint;
    private int  times;

    public  PrintChar(char c,int times){
        this.cToPrint=c;
        this.times=times;

    }

    public void run(){

        for (int i=0;i<times;i++)
        {
            System.out.print(cToPrint);
        }

    }

}

class  PrintNum implements  Runnable{
    private int times;
    private int lastNum;

    public int getTimes() {
         return  this.times;
    }
    public  PrintNum(int num){
        this.lastNum=num;
    }

    public void run(){
       for(int i=1;i<lastNum;i++){
           System.out.print(""+i);
       }
    }
}
