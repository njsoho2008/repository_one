package ch6;

//调用toString(),就新生成了一个堆对象
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(true);
        stringBuffer.append("test");
        stringBuffer.append("\t");
        for (int i = 0; i < 3; i++) {
            stringBuffer.append(i);
        }
        String str1 = stringBuffer.toString();
        System.out.println(str1);
        stringBuffer.insert(1, "插入字符");
        String str2 = stringBuffer.toString();
        System.out.println("str1==str2吗？" + (str1 == str2));
        System.out.println("str2 1:" + str2);

        stringBuffer.delete(0, 4);
        str2 = stringBuffer.toString();
        System.out.println("str2 2:" + str2);


    }
}
