package cn.edu.javaprogram_edition10.ch17;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;

public class TestIO {
    public static void main(String[] args) throws Exception{
        ObjectOutputStream output=new ObjectOutputStream(new FileOutputStream("c:\\test.dat"));
        LinkedHashSet<String> set1=new LinkedHashSet<>();
        set1.add("new york");
        LinkedHashSet<String> set2=(LinkedHashSet<String>)set1.clone();
        set2.add("亚特兰大");
        output.writeObject(set1);
        output.writeObject(set2);
        output.close();
        ObjectInputStream input=new ObjectInputStream(new FileInputStream("c:\\test.dat"));
        set1=(LinkedHashSet<String>)input.readObject();
        set2=(LinkedHashSet<String>)input.readObject();
        System.out.println(set1);
        System.out.println(set2);
        input.close();
    }
}
