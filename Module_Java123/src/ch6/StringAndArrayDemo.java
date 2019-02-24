package ch6;

//字符数组变成字符串
//字符串填充到数组中去
public class StringAndArrayDemo {
    public static void main(String[] args) {
        String s = "welcome to java";
        //字符数组变成字符串
        String str = String.valueOf(new char[]{'h', 'e', 'l', 'l', 'o'});
//字符串填充到数组中去
        char[] charsarray = new char[20];
        s.getChars(0, 15, charsarray, 0);
        for (char ch : charsarray
                ) {
            System.out.print(ch);

        }
    }
}
