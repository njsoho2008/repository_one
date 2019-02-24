package cn.edu.javaprogramming_edition10;

public class Test2 {
    public static void main(String[] args) {
        Count myCount = new Count();
        int times = 0;
        for (int i = 0; i < 10; i++)
            increment(myCount, times);
        System.out.println("count is " + myCount.count);
        System.out.println("times is " + times);

            int[] array={2,3,4,5,6,7};
            for(int i=1;i<array.length;i++){
                array[i]=array[i-1];
            }
            for(int i=0;i<array.length;i++){
                System.out.print(array[i]+" ");
            }


        System.out.println("     ;899----------------");
        System.out.println(Integer.parseInt("10",2));
    }

    public static void increment(Count c, int times) {
        c.count++;
        times++;
    }
}

class Count {
    public int count;

    public Count(int c) {
        count = c;
    }

    public Count() {
        count = 1;
    }
}

