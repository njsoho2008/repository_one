package ch3;
//位运算
public class BitCalculateDemo {
    public static void main(String[] args) {
//        ^(亦或运算) ，针对二进制，相同的为0，不同的为1
////打印的结果是:   2^3运算的结果是 :1
        System.out.println("2^3运算的结果是 :"+(2^3));


        System.out.println("2|3运算的结果是 :"+(2|3));

        System.out.println("~3运算的结果是 :"+(~3));

//        &（与运算） 针对二进制，只要有一个为0，就为0
        System.out.println("2&3运算的结果是 :"+(2&3));

//        <<(向左位移) 针对二进制，转换成二进制后向左移动3位，后面用0补齐 （无论正负数）

        System.out.println("2<<3运算的结果是 :"+(2<<3));
        System.out.println("2<<9运算的结果是 :"+(2<<9));

//        >>(向右位移) 针对二进制，转换成二进制后向右移动3位，
//      如果是正数，在高位补零，如果是负数，则在高位补1；注意，不是最高位，是所有的高位
        System.out.println("2>>3运算的结果是 :"+(2>>3));
        System.out.println("16>>2运算的结果是 :"+((16)>>2));


//        补码表示-16 ：11111111 11111111 11111111 11110000  右移2位： 11111111 11111111 11111111 11111100
        System.out.println("-16>>2运算的结果是 :"+((-16)>>2));

//        >>>(无符号右移)  无符号右移，忽略符号位，高位空位都以0补齐，计算结果就是从负数变成正数了
//        补码表示-16 ：11111111 11111111 11111111 11110000  右移4位： 00001111 11111111 11111111 11111111
        System.out.println("-16>>>2运算的结果是 :"+((-16)>>>2));

        System.out.println("16>>>2运算的结果是 :"+((16)>>>2));

//        -1的 取反
        System.out.println("-1按位取反："+(~(-1)));  //0
        System.out.println("-2按位取反："+(~(-2))); //1
        System.out.println("-4按位取反："+(~(-4))); //3




    }

}