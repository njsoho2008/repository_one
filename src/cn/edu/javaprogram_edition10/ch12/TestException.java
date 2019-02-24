package cn.edu.javaprogram_edition10.ch12;

public class TestException {
    public static void main(String[] args){


    }

    public static void m(int value) throws Exception
    {
        if(value<40){
            throw new Exception("value is too small");
        }
    }

}
