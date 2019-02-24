package cn.edu.javaprogram_edition10;

public class StopWatch {
    private long startTime;
    private long endTime;
    private int capcity;
    private double[] arr;
    public static final int DEFAULT_CAPCITY = 10000;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    /*将系统当前时间设置为开始时间*/
    public long start() {
        return this.startTime = System.currentTimeMillis();

    }

    public long stop() {
        return this.endTime = System.currentTimeMillis();
    }


    public long getEndTime() {
        return endTime;
    }

    public long getElapsedTime() {
        return (this.getEndTime() - this.getStartTime());
    }

    protected double[] getNumbersByRandom() {

        arr = new double[capcity];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = (int) (Math.random() * arr.length);
        }
        return arr;
    }

    public static void main(String[] args) {

        StopWatch sw = new StopWatch();
        sw.capcity = StopWatch.DEFAULT_CAPCITY;
//        double[] testarr=new double[StopWatch.DEFAULT_CAPCITY];

        long l1 = sw.start();
        double[] doubles = sw.getNumbersByRandom();
      /*  for (int i=0;i<doubles.length;i++)
        {
            System.out.println(doubles[i]);
        }*/
        long l2 = sw.stop();

        System.out.println("生成随机数花费的时间：" + sw.getElapsedTime());
        System.out.println("*******************************");
        long l3 = sw.start();
        sw.arr = sw.selectionSort(sw.getNumbersByRandom());
        long l4 = sw.stop();
        System.out.println("排序花费的时间：" + sw.getElapsedTime());
        System.out.println("输出部分排序结果");
        for (int i = 0; i < (int) (sw.arr.length / 40); i++)
            System.out.print(sw.arr[i] + " ");
    }

    /*选择排序法*/
    public double[] selectionSort(double[] arr) {
//          double[] new_array=new double[capcity];

        for (int i = 0; i < arr.length - 1; i++) {
            double min = arr[i];
            int minIndex = i;
              /*找出最小的数，并记录下标*/
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
             /*将最小的数与当前数组的第一个元素进行交换位置和对应的元素值swap*/
            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }

        return arr;
    }

}
