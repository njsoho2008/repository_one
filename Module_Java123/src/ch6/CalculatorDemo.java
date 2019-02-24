package ch6;

public class CalculatorDemo {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.exit(0);
        }
        int result = 0;
        switch (args[1].charAt(0)) {
            case '+':
                result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                break;
            case '-':
                result=Integer.parseInt(args[0])-Integer.parseInt(args[2]);
                break;
            case '.':
                result=Integer.parseInt(args[0])*Integer.parseInt(args[2]);
                break;
            case '/':
                result=Integer.parseInt(args[0])/Integer.parseInt(args[2]);
                break;


        }
        System.out.println("计算结果是："+result);

    }
}
