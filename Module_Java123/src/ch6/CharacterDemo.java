package ch6;

public class CharacterDemo {
    public static void main(String[] args) {
      /*
      ASSCII码0-127   16位 Unicode码表示 为\u0000----\u007F
      *
      * */
//      一个char占 2个字节长度 0-65535
//        十六进制  十进制 转换为 字符
        char ch1 = (char) 0x0041;
        char ch2 = (char) 65100;
        char ch3 = (char) 107;
        System.out.println("字符char is   " + ch1 + "\n" + ch2 + "\n" + ch3);

        char ch4 = 180;
        int ch5 = 0xFFF4;
        byte ch6 = (byte) 0xFFF4;   //强制类型转换
        System.out.println("字符ch4 = " + ch4 + "\n 整形数ch5 = " + ch5 + "\n ch6=" + ch6);

        System.out.println(Character.isAlphabetic(78));//判断是否是字母
        System.out.println(Character.isAlphabetic(178));//判断是否是字母
        System.out.println(Character.isLetter(78));
        System.out.println(Character.isLetter('^'));
        System.out.println(Character.isDigit('^'));
        System.out.println(Character.isDigit(67));


    }
}
