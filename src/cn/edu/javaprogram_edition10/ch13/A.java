package cn.edu.javaprogram_edition10.ch13;

public class A implements Comparable<String> {
    private  String s;
    public  A(){
        new String(this.s);
    }
    public  A(Integer integer){
        new Integer(integer);
    }

    public  A(String  mys){
        System.out.print(this.s);
    }


    @Override
    public int compareTo(String o) {
        if (o.charAt(0) > o.charAt(1))
            return 1;
        else if (o.charAt(0) == o.charAt(1))
            return 0;
        else
            return -1;
    }

    public static void main(String[] args){
        A a1=new A ("good moring");
        A a2=new A("good afternoon");

         System.out.println(a1.compareTo("good "));
        System.out.println(a2.compareTo("mmm"));


    }
}
