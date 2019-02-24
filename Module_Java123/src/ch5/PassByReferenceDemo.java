package ch5;

public class PassByReferenceDemo {
    public static void main(String[] args){
        char[] chars={'h','e','l', 'l', 'o', ',' ,'j','a','v','a' };
        myprint(chars);

    }
    public static void myprint(char[] ch){
        for (char c:ch
             ) {
            System.out.print(c+" ");

        }

    }


}
