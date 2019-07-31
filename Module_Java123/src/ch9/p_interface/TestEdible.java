package ch9.p_interface;

import ch9.p_interface.*;

public class TestEdible {
    public static void main(String[] args){
        Object[] objects={new Tiger(),new Chicken(), new Apple()};
        for (int i=0;i<objects.length;i++){
            if(objects[i] instanceof Edible){
                System.out.println(objects[i].getClass().getName()+":"+((Edible)objects[i]).howToEat());
            }
            if(objects[i] instanceof Animal){
                System.out.println(objects[i].getClass().getName()+":"+((Animal)objects[i]).sound());

            }
        }

    }
}
