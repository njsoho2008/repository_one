package ch14.quhaoji;

public class TickWindow  extends  Thread{
    private final String name ;
    private static final  int max=50;
    private int index=1;

    public TickWindow(String name) {
        this.name = name;
    }
    @Override
    public void run(){
        while (index<max){
            System.out.println("柜台："+name+"当前的号码是："+(index++));
        }
    }

    public static void main(String[] args) {
        TickWindow tickWindow1=new TickWindow("一号出号机");
        tickWindow1.start();
        TickWindow tickWindow2=new TickWindow("二号出号机");
        tickWindow2.start();
        TickWindow tickWindow3=new TickWindow("三号出号机");
        tickWindow3.start();
        TickWindow tickWindow4=new TickWindow("四号出号机");
        tickWindow4.start();
    }

}
