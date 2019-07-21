package ch14.quhaoji;

public class TickWindow_modify1 extends  Thread{
    private final String name ;
    private static final  int max=50;
    private static int index=1;

    public TickWindow_modify1(String name) {
        this.name = name;
    }
    @Override
    public void run(){
        while (index<=max){
            System.out.println("柜台："+name+"当前的号码是："+(index++));
        }
    }

    public static void main(String[] args) {
        TickWindow_modify1 tickWindow1=new TickWindow_modify1("一号出号机");
        tickWindow1.start();
        TickWindow_modify1 tickWindow2=new TickWindow_modify1("二号出号机");
        tickWindow2.start();
        TickWindow_modify1 tickWindow3=new TickWindow_modify1("三号出号机");
        tickWindow3.start();
        TickWindow_modify1 tickWindow4=new TickWindow_modify1("四号出号机");
        tickWindow4.start();
    }

}
