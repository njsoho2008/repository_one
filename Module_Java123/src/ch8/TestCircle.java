package ch8;

public class TestCircle {
    public static void main(String[] args){
          CircleFromSimpleGeometicObject myc=
                  new CircleFromSimpleGeometicObject(11,"red",true);

        System.out.println(myc.toString());

         System.out.println("*************************************");
        System.out.println(myc.printCircle());

    }
}
