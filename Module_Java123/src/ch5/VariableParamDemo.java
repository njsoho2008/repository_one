package ch5;

//可变长度参数
//以数组作为参数
public class VariableParamDemo {
    public static void main(String[] args){
        int[] a={1,3,5,7,9};
        print(a);
        print2("可变长度的参数列表I",a);
        print2("可变长度的参数列表II",1000000,3,44,66,99,999,99999);

    }
//    以数组作为参数
    public static void print(int[] x){
        int len=x.length;
        for(int i=0;i<len;i++) {
            System.out.print(x[i]+" ");
        }
        System.out.println();
    }

    //可变长度参数
//    可变长度的参数只能是参数列表的最后一个参数
    public  static  void print2(String str,int...x){
        int len=x.length;// 咦，跟数组是不是一样的？？？
        for(int i=0;i<len;i++) {
            System.out.println(str +x[i]);
        }
    }

}
