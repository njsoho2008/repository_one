package ch8;

public class TestOverLoad_Override {
    Object[] o = new Object[40];
    //       Object[] 02=new int[50];
    Object[] o3 = new String[40];

    public static void main(String[] args) {
        Object[] o = new Integer[50];

        B b = new A();
        b.p(10);
        b.p(10.0);

        System.out.println(b.pb(11, "hahha"));
        //有继承关系，不会出问题，无继承关系呢？

        ((A) b).pp(99);
//    b.pp(989);
        System.out.println(b.toString());//动态绑定
        B b2 = new B();
        b2.p(10);
        System.out.println("-------------------------");
        A a = new A();
        a.p(9);
        a.pp(999);
        a.pb(22, "eeeee");
        A.prt();

    }
}

class B {
    public void p(double i) {
        System.out.println("B类的输出" + i * 2);

    }

    public double p(double i, String str) {
        return i + 2;
    }

    public double pb(double i, String str) {
        System.out.print(str + "----");
        System.out.println(i + 4);
        return i + 4;
    }

    /* public  String toString(){
        System.out.println("B类的toString()");
        return "ok";
     }*/
    public static void prt() {
        System.out.println("父类对象B的prt()方法");
    }
}

class A extends B {
    @Override
    public void p(double i) {

        System.out.println(i);
        super.p(i);
        return;
    }

    @Override
    public String toString() {
        System.out.println("&&&&&&&&&&&   " + super.toString());
        return "重新了toString()方法";
    }

    public void pp(double i) {
        System.out.println("源自PP()方法的输出");
        System.out.println("子类新扩展的pp()方法，" + i);

    }

    public static void prt() {
        System.out.println("子类A重写（隐藏）了父类的prt-----");
        B.prt();
    }
}