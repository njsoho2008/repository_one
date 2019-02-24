package cn.edu.niit.codingke.ch7;



import java.awt.*;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

import Decoder.BASE64Encoder;


public class MD5Demo {
    public static void main(String[] args){
        try {
            MessageDigest md=MessageDigest.getInstance("md5");
            String pwd="amind123456";
            //计算md5摘要
            byte[] bytes=md.digest(pwd.getBytes("UTF-8"));//摘要不可逆
            System.out.println(Arrays.toString(bytes));
            String newStr=new String(bytes,"UTF-8");
            System.out.println(newStr);//这个看不懂的乱吗
            //
            // 用一个可见的字符去存储计算结果
            //如 a-z A-Z 0-9 / *   Base64 编码算法  把bytes转成64 编码表示，Base64 编码可逆

           String  pwdStr= Base64.getEncoder().encodeToString(bytes);
            System.out.println(pwdStr);
           //jdk1.8之前的做法
           BASE64Encoder base64Encoder=new BASE64Encoder();
              String str2=base64Encoder.encode(bytes);
                System.out.println(str2);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }
}
