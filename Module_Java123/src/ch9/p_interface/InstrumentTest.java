package ch9.p_interface;

public class InstrumentTest {

    public void testPlay(Instrument i) {
        i.play();
    }

    public static void main(String[] args) {
        InstrumentTest it = new InstrumentTest();

//        匿名类
        it.testPlay(new Piano());
        Trumpet trumpet=new Trumpet();

        it.testPlay(trumpet);
    }
}

class Piano implements Instrument {
    public void play() {
        System.out.println("钢琴是用手弹的");
    }
}

class Violin implements Instrument {
    public void play() {
        System.out.println("小提琴是用手拉的");
    }
}

class Trumpet implements Instrument {
    public void play() {
        System.out.println("小号也是用嘴吹的");
    }
}