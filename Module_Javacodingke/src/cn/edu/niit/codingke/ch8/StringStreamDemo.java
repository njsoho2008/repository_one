package cn.edu.niit.codingke.ch8;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.StringTokenizer;
/**
 * 在web编程中，通常存在有向服务器读取数据文件的时候，一般有(XML JSON)格式，因此需要将字符数据
 * 转化成StringReader（字符流），然后再用第三方数据解析器 StreamTokenizer来解析
 *
 */


public class StringStreamDemo {
    public  static  void StrReader(){
        String  str="good good study,day day up";
        StringReader sr=new StringReader(str);
        StreamTokenizer streamTokenizer=new StreamTokenizer(sr);
        int count=0;
        while (streamTokenizer.ttype!=StreamTokenizer.TT_EOF){
            try {
                if(streamTokenizer.nextToken()==StreamTokenizer.TT_WORD){
                    count++;


                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        sr.close();
        System.out.println("一共有"+count+"个单词");

    }


    public static void main(String[] args){
        StrReader();

    }
}
