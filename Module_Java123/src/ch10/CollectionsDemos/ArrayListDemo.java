package ch10.CollectionsDemos;

import ch10.MyStack;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("南京");
        arrayList.add("南京");
        arrayList.add("南京");
        arrayList.add("南京");
        arrayList.add("南京");
        arrayList.add(0, "北京");
        arrayList.add(6, "上海");

        ArrayList<MyStack> arrayList1=new ArrayList();

        arrayList1.add(new MyStack());

        for (String e : arrayList
                ) {
            System.out.print(e + "  ");

        }
        arrayList.remove(5);
    }
}
