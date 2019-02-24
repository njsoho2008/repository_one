package cn.edu.niit.codingke.ch8;
import java.io.File;

public class GetFilePathDemo {

    private static String cp = "/IdeaProjects/src/cn/edu/niit/ch8/text.txt";

    public static void main(String[] args) {
        //当前类的绝对路径
        System.out.println(GetFilePathDemo.class.getResource("/").getFile());
        //指定CLASSPATH文件的绝对路径
        System.out.println(GetFilePathDemo.class.getResource(cp).getFile());
        //指定CLASSPATH文件的绝对路径
        File f = new File(GetFilePathDemo.class.getResource(cp).getFile());
        System.out.println(f.getPath());
    }
}
