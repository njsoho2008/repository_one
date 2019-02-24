package cn.edu.niit.codingke.ch7;

public class CloneableCatTest {
    public static void main(String[] args) {


    CloneableCat cat = new CloneableCat("miaomiao", 11);
    try

    {
        CloneableCat newcat = (CloneableCat) cat.clone();
        System.out.println(cat.toString());
        System.out.println(newcat.toString());
    }catch(
    CloneNotSupportedException exception)

    {
        exception.printStackTrace();
    }
}
}
