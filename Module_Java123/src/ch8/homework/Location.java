package ch8.homework;

import java.util.Scanner;

public class Location {
    private int row;
    private int column;
    private double maxvalue;

    public Location() {
    }

    public Location(int row, int column, double maxvalue) {
        this.maxvalue = maxvalue;
        this.row = row;
        this.column = column;
        System.out.println("\n 二位数组的最大值是" + this.maxvalue);
        System.out.println("\n 最大值位置如下" + "(" + this.row + "," + this.column + ")");
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public double getMaxvalue() {
        return maxvalue;
    }

    public void setMaxvalue(double maxvalue) {
        this.maxvalue = maxvalue;
    }

    public static Location locateLargest(double[][] a) {
        Location location = new Location();
        double max = 0;
        int locateX = 0, locateY = 0;
        int i = 0, j = 0;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    locateX = i;
                    locateY = j;
                }
            }
        }

        location.row = locateX;
        location.column = locateY;
        location.maxvalue = max;
        return location;
    }

    public static Location largestValue(double[][] a) {
        double max = 0;
        int locateX = 0, locateY = 0;
        int i = 0, j = 0;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    locateX = i;
                    locateY = j;
                }
            }

        }
        return new Location(locateX, locateY, max);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();
        double[][] a = new double[row][col];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = 20 + (int) (Math.random() * 30);
            }
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
        System.out.println();

        Location location = Location.locateLargest(a);

        System.out.println("二位数字的最大值是：" + location.getMaxvalue() + "," + "\n(" + location.getRow() + "," + location.getColumn() + ")");
        System.out.println("---------------------------------------------------------------");
        Location location1 = Location.largestValue(a);

        System.out.println(location.getMaxvalue() + "," + "\n(" + location.getRow() + "," + location.getColumn() + ")");
    }

}
